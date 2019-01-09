//Airbnb Interview Question
public class FindMedian {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        findMedian(nums);

    }


    public static double findMedian(int[] nums) {

        int len=0;
        for(int num : nums){
            len++;
        }

        if(len%2!=0){
            return (double) search(nums, len/2 + 1, Integer.MIN_VALUE, Integer.MAX_VALUE);

        }else{
            return ((double) search(nums, len/2, Integer.MIN_VALUE, Integer.MAX_VALUE)
                    + (double)search(nums, len/2+1, Integer.MIN_VALUE, Integer.MAX_VALUE))/2;

        }

    }

    public static int search(int[] nums , int k, int left,int right){
        if (left >= right) {
            return left;
        }
        int guess  = left + (right-left)/2;
        int count=0,res=Integer.MIN_VALUE;

        for(int num : nums){
            if(num<=guess){
                count++;
                res = Math.max(res,num);
            }
        }

        if(count==k){
            return res;
        } else if(count < k){
            return search(nums, k , Math.max(res+1,guess),right);
        }else
            return search(nums, k , left,res);


    }


}
