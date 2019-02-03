class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid.length==0 || grid[0].length==0) return 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        if(grid[0][0]==0) dp[0][0]=1;

        for(int j=0;j<m;j++){
            if(grid[0][j]==1) break;
            dp[0][j]=1;
        }

        for(int j=0;j<n;j++){
            if(grid[j][0]==1) break;
            dp[j][0]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(grid[i][j]!=1){
                    dp[i][j]+=dp[i-1][j];

                    dp[i][j]+=dp[i][j-1];
                }
            }
        }


        return dp[n-1][m-1];
    }
}