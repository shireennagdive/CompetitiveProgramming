public class FibonaciSubsequence {
        public int lenLongestFibSubseq(int[] nums) {
            if(nums==null || nums.length<3) return 0;

            int dp[][] = new int[nums.length][nums.length];

            int max = Integer.MIN_VALUE;

            for(int i=2;i<nums.length;i++){
                int target = nums[i];
                int low = 0, high = i-1;

                while(low < high){
                    if(nums[low] + nums[high] > target){
                        high--;
                    }
                    else if(nums[low] + nums[high] < target){
                        low++;
                    }
                    else{
                        dp[high][i] = dp[low][high] + 1;
                        max = Math.max(max , dp[high][i]);
                        low++;
                        high--;
                    }
                }
            }
            return max == Integer.MIN_VALUE ? 0 : max+2;
        }
    }
