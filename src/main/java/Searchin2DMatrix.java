public class Searchin2DMatrix {

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length==0 || matrix[0].length==0) return false;
            int i;
            for(i=0;i<matrix.length;i++){
                if(matrix[i][0] > target) break;
            }

            return (i==0) ? binarySearch(matrix[i],target) : binarySearch(matrix[i-1],target) ;

        }

        public boolean binarySearch(int[] row, int target){
            int low=0,high=row.length-1,mid;
            while(low<=high){
                mid=low + (high-low)/2;
                if(row[mid]==target) return true;
                else if(target<row[mid]) high=mid-1;
                else low=mid+1;
            }
            return false;
        }
    }

//        public boolean searchMatrix(int[][] matrix, int target) {
//            int m = matrix.length;
//            if(m==0) return false;
//            int n = matrix[0].length;
//            if(m==0 || n==0) return false;
//            int start,end,mid;
//            for(int i=0;i<m;i++){
//                if(target >= matrix[i][0] && target <= matrix[i][n-1]){
//                    start=0;end=n-1;
//                    while(start<=end){
//                        mid=(start+end)/2;
//                        if(target==matrix[i][mid]) return true;
//                        else if(target > matrix[i][mid]) start=mid+1;
//                        else end=mid-1;
//                    }
//                    return false;
//                }
//            } return false;
//        }



}
