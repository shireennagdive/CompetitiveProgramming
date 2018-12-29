public class Searchin2DMatrixII {
        //Complexity - - O(m+n)
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
            int n=matrix.length,m=matrix[0].length,r=0,c=m-1;
            while(r<n && c>=0){
                if(target==matrix[r][c]) return true;
                else if(target<matrix[r][c]) c--;
                else r++;
            }
            return false;
        }
    }
