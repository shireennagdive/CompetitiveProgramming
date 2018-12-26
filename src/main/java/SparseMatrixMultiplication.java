public class SparseMatrixMultiplication {
        public int[][] multiply(int[][] A, int[][] B) {
            int n = A.length, m = B[0].length, bRow=B.length;
            int[][] C = new int[n][m];
            for(int i=0;i<n;i++){
                for(int k=0;k<bRow;k++){
                    if(A[i][k]!=0){

                        for(int j=0;j<m;j++){
                            if(B[k][j]!=0) {
                                C[i][j] += A[i][k] * B[k][j];
                            }
                        }
                    }
                }
            }
            return C;
        }
}
