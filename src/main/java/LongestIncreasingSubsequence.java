public class LongestIncreasingSubsequence {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if(nums!=null && nums.length == 0)return 0;
            int max=1,temp,j;
            int[] dp = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                dp[i] = 1;
            }
            for(int i=1;i<nums.length;i++){
                temp=1;
                for(j=0;j<i;j++){
                    if(nums[i] > nums[j]){
                        temp = Math.max(1+dp[j],temp);
                    }
                }
                dp[i] = temp;
                max = Math.max(dp[i],max);
            }
            return max;
        }
    }
}
