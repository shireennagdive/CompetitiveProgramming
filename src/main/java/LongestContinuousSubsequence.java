public class LongestContinuousSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int max=1,cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                cnt++;
                if(cnt > max) max=cnt;
            }else{
                cnt=1;
            }
        }
        return max;
    }
}
