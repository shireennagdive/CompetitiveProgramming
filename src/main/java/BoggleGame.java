import java.util.ArrayList;
import java.util.List;

public class BoggleGame {
    static List<String> res;
    public static List<String> findWords(char[][] board, String[] words) {
        Trie root = buildTrie(words);
        res = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board, i, j, root);
            }
        }
        for(String a : res){
            System.out.println(a);
        }

        return res;
    }


    public static void dfs(char[][] board, int row, int col, Trie node){

        if(row<0 || row>board.length-1 || col<0 || col> board[0].length-1 || board[row][col]=='*' || node.next[board[row][col]-'a']==null) return;

        char c = board[row][col];
        node = node.next[c-'a'];
        if(node.value!=null){
            res.add(node.value);
            node.value=null;
        }


        board[row][col]='*';
        dfs(board,row+1,col,node);
        dfs(board,row-1,col,node);
        dfs(board,row,col+1,node);
        dfs(board,row,col-1,node);
        dfs(board,row+1,col-1,node);
        dfs(board,row+1,col+1,node);
        dfs(board,row-1,col+1,node);
        dfs(board,row-1,col+1,node);
        board[row][col]=c;
    }

    public static Trie buildTrie(String[] words){
        Trie root = new Trie();
        for(String s : words){
            Trie node = root;
            for(char c : s.toCharArray()){
                if(node.next[c-'a']==null) node.next[c-'a'] = new Trie();
                node = node.next[c-'a'];
            }
            node.value = s;
        }
        return root;
    }

    public static void main(String[] args) {
        char board[][]   = {{'g','i','z'},
                {'u','e','k'},
                {'q','s','e'}};
        findWords(board,new String[]{"geeks","quiz"});
    }
}

class Trie{
    Trie[] next = new Trie[26];
    String value;
}
