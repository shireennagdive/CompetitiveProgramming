public class FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

        public int firstBadVersion(int n) {

            int low=1,high=n,mid;
            while(low<high){
                mid = low + (high-low)/2;
                if(isBadVersion(mid)){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }
            return high;
        }

        public boolean isBadVersion(int mid){ //defined in problem
            return true;
        }
    }

