public class MaxArea {

        public int maxAreaOfIsland(int[][] grid) {
            int max=0,temp;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1) max = Math.max(dfs(i,j,grid),max);
                }
            }
            return max;
        }

        public int dfs(int row,int col,int[][] grid){
            if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1 || grid[row][col]==0) return 0;
            grid[row][col]=0;
            return dfs(row-1,col,grid) + dfs(row+1,col,grid) + dfs(row,col-1,grid) + dfs(row,col+1,grid) + 1;
        }

}
