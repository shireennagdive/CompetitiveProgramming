public class WordSearch {
        public boolean exist(char[][] board, String word) {
            boolean res=false;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j] == word.charAt(0)){
                        res = dfs(i, j, 0, word, board);
                    }
                    if(res) return res;
                }
            }
            return res;
        }

        public boolean dfs(int row, int col, int charPos, String str, char[][] board){
            if(charPos == str.length()) return true;
            if(row<0 || row>board.length-1 || col<0 || col>board[0].length-1 || board[row][col]!=str.charAt(charPos) || board[row][col]=='0') return false;
            boolean d=false;
            char value = board[row][col];
            board[row][col] = '0';
            d = dfs(row,col+1,charPos+1,str,board) || dfs(row+1,col,charPos+1,str,board) || dfs(row-1,col,charPos+1,str,board) || dfs(row,col-1,charPos+1,str,board);
            board[row][col] = value;
            return d;
        }
    }

