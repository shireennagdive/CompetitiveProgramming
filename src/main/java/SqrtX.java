public class SqrtX {
        public int mySqrt(int x) {
            if(x==0 || x==1) return x;
            int temp;
            int low=0,high=x,mid;
            while(low<high){
                mid=(low+high)/2;
                temp=x/mid;
                if(mid==temp){
                    return mid;
                }else if(mid > temp){
                    high=mid;
                }else if(mid < temp){
                    low=mid+1;
                }
            }
            return low-1;
        }
}
