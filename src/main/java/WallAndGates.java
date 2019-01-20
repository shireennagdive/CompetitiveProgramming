import java.util.LinkedList;
import java.util.Queue;
public class WallAndGates {


    // //* Definition for a binary tree node.
    //  public class TreeNode {
    //      int val;
    //      TreeNode left;
    //      TreeNode right;
    //      TreeNode(int x) { val = x; }
    //  }



        public static int[][] directions = new int[][]{
                {-1,0},
                {1,0},
                {0,1},
                {0,-1}
        };
        public static void wallsAndGates(int[][] rooms){

            Queue<int[]> queue = new LinkedList<>();

            for(int i=0;i<rooms.length;i++){
                for(int j=0;j<rooms[0].length;j++){
                    if(rooms[i][j]==0){
                        queue.offer(new int[]{i,j});
                    }
                }
            }

            while(!queue.isEmpty()){
                int[] pos = queue.poll();
                for(int[] direct : directions){
                    int row = pos[0] + direct[0];
                    int col = pos[1] + direct[1];
                    if(row < 0 || row> rooms.length-1 || col<0
                            || col>rooms[0].length-1 || rooms[row][col]!=Integer.MAX_VALUE){
                        continue;
                    }

                    rooms[row][col] = rooms[pos[0]][pos[1]] + 1;
                    queue.offer(new int[]{row,col});
                }
            }

        }



        public static void main(String args[]){
            Solution sol = new Solution();

            int[][] a = new int[][]{
                    {2147483647 , 2147483647 , 2147483647 ,  0},
                    {2147483647 ,  2147483647 , 2147483647, 2147483647},
                    {0,           2147483647  , 2147483647 , 2147483647}
            };


            wallsAndGates(a);

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

      /*INF  -1  0  INF
        INF  INF INF  -1
        INF  -1  INF  -1
        0  - 1  INF INF*/

      /*
       3  -1   0   1
       2   2   1  -1
       1  -1   2  -1
       0  -1   3   4
      */

        }


    }

