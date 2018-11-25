public class SetMatrixZeroes {
    class Solution {
        public void setZeroes(int[][] matrix) {
            boolean firstRow=false,firstCol=false;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                        if(i==0) firstRow=true;
                        if(j==0) firstCol=true;
                    }
                }
            }

            for(int r=1;r<matrix.length;r++){ //moving rowwise
                if(matrix[r][0]==0){
                    for(int j=1;j<matrix[0].length;j++){
                        matrix[r][j]=0;
                    }
                }
            }
            for(int c=1;c<matrix[0].length;c++){  //moving columwise
                if(matrix[0][c]==0){
                    for(int j=0;j<matrix.length;j++){
                        matrix[j][c]=0;
                    }
                }
            }
            if(firstRow){
                for(int j=1;j<matrix[0].length;j++){
                    matrix[0][j]=0;
                }
            }
            if(firstCol){
                for(int j=1;j<matrix.length;j++){
                    matrix[j][0]=0;
                }
            }
        }
    }
}
