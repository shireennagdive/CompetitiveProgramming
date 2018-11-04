public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length,temp,i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                swap(i,j,matrix);
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n/2;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

    }
    public void swap(int a,int b,int[][] m){
        int temp;
        temp = m[a][b];
        m[a][b] = m[b][a];
        m[b][a] = temp;
    }

}
