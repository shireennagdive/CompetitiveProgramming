public class Islands {
    class Solution {
        public int numIslands(char[][] grid) {
            int count=0;
            if(grid.length!=0){
                for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[0].length;j++){
                        if(grid[i][j]=='1'){
                            dfs(i,j,grid);
                            count++;
                        }
                    }
                }
            }
            return count;
        }

        public void dfs(int row,int col,char[][] grid){
            if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1 || grid[row][col]!='1') return;
            grid[row][col] = '0';
            dfs(row-1,col,grid);dfs(row+1,col,grid); dfs(row,col-1,grid);
            dfs(row,col+1,grid);
            return;
        }

    }
}
