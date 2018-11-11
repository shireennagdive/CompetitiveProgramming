public class FlipAnImage {

        public int[][] flipAndInvertImage(int[][] A) {
            int temp;
            int rowLen = A.length;
            int colLen = A[0].length;
            for(int i=0;i<rowLen;i++){
                for(int j=0;j<colLen/2;j++){
                    temp=A[i][j];
                    A[i][j] = A[i][colLen-1-j];
                    A[i][colLen-1-j] = temp;
                    A[i][j]^=1;
                }
            }
            for(int i=0;i<rowLen;i++){
                for(int j=colLen/2;j<colLen;j++){
                    A[i][j]^=1;
                }
            }
            return A;
        }

    }
