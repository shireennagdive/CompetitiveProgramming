import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SlidingPuzzle {
        public int slidingPuzzle(int[][] board) {
            String res = "123450";
            StringBuilder temp = new StringBuilder();
            int moves=0;
            Queue<String> queue = new LinkedList<>();
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    temp.append(board[i][j]);
                }
            }


            Set<String> visited = new HashSet<>();
            int[][] dirs = new int[][]{{1,3},{0,2,4},{1,5},{0,4},{3,1,5},{2,4}};
            queue.offer(temp.toString());
            while(!queue.isEmpty()){
                int size = queue.size();
                for(int i=0;i<size;i++){
                    String b = queue.poll();
                    if(b.equals(res)){
                        return moves;
                    }
                    int c = b.indexOf('0');
                    for(int pos : dirs[c]){
                        temp = swap(b,c,pos);
                        if(!visited.contains(temp.toString())){
                            queue.offer(temp.toString());
                            visited.add(temp.toString());
                        }
                    }
                }
                moves++;
            }
            return -1;
        }

        public StringBuilder swap(String s , int i,int j){
            StringBuilder res = new StringBuilder(s);
            char temp = s.charAt(i);
            res.setCharAt(i, s.charAt(j));
            res.setCharAt(j, temp);
            return res;
        }
}
