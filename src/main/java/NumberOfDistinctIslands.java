import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctIslands {
        //Complexity - O(m*n)
        public int numDistinctIslands(int[][] grid) {
            if(grid==null || grid.length==0 || grid[0].length==0) return -1;
            Set<String> set = new HashSet<>();
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        StringBuilder sb = new StringBuilder();
                        dfs(i,j,"s",grid,sb);
                        //System.out.println(sb);
                        set.add(sb.toString());
                    }
                }
            }
            return set.size();
        }

        public void dfs(int row, int col, String s, int[][] grid, StringBuilder sb){
            if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1 || grid[row][col]!=1) return;
            grid[row][col]=0;

            sb.append(s);
            dfs(row-1,col,"u",grid,sb);
            dfs(row+1,col,"d",grid,sb);
            dfs(row,col-1,"l",grid,sb);
            dfs(row,col+1,"r",grid,sb);
            sb.append("e");

        }
}
