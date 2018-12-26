public class CountRectangles {
        public int countCornerRectangles(int[][] grid) {
            int count=0,cols=grid[0].length;
            int[][] state = new int[cols][cols];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<cols;j++){
                    if(grid[i][j]==1){
                        for(int end=j+1;end<cols;end++){
                            if(grid[i][end]==1){
                                count+=state[j][end];
                                state[j][end]++;
                            }

                        }
                    }

                }
            }
            return count;
        }
}

/*Initial Sol :
* class Solution {
    public int countCornerRectangles(int[][] grid) {
        int count=0,count1=0,temp=0;
        for(int i=0;i<grid.length;i++){
            for(int j=i+1;j<grid.length;j++){
                count1=0;
                for(int col=0;col<grid[0].length;col++){
                    if(grid[i][col]==1 && grid[j][col]==1){
                        count1++;
                    }
                }

                    count+=(count1*(count1-1))/2;

            }
        }
        return count;
    }
}
* */
