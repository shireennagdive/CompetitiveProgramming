public class Searchin2DMatrix {

        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            if(m==0) return false;
            int n = matrix[0].length;
            if(m==0 || n==0) return false;
            int start,end,mid;
            for(int i=0;i<m;i++){
                if(target >= matrix[i][0] && target <= matrix[i][n-1]){
                    start=0;end=n-1;
                    while(start<=end){
                        mid=(start+end)/2;
                        if(target==matrix[i][mid]) return true;
                        else if(target > matrix[i][mid]) start=mid+1;
                        else end=mid-1;
                    }
                    return false;
                }
            } return false;
        }

}
