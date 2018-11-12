public class FloodFill {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            boolean visited[][] = new boolean[image.length][image[0].length];
            dfs(sr,sc,newColor,image[sr][sc],image,visited);
            return image;
        }
        public void dfs(int r,int c,int newColor,int srcColor, int[][]image,boolean[][] visited){
            if(r<0 || r>image.length-1 || c<0 || c>image[0].length-1 || image[r][c]!=srcColor || visited[r][c])return;
            image[r][c] = newColor;
            visited[r][c] = true;
            dfs(r-1,c,newColor,srcColor,image,visited);
            dfs(r+1,c,newColor,srcColor,image,visited);
            dfs(r,c+1,newColor,srcColor,image,visited);
            dfs(r,c-1,newColor,srcColor,image,visited);
            return;
        }
}
