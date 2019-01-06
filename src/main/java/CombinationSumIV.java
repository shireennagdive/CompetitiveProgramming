public class CombinationSumIV {
    public class Solution {

        public int combinationSum4(int[] nums, int target) {
            int[] sums = new int[target + 1];
            sums[0] = 1;
            for (int sum = 1; sum <= target; sum++) {
                for (int i = 0; i < nums.length; i++) {
                    if (sum - nums[i] >= 0) sums[sum] += sums[sum - nums[i]];
                }
            }
            // for(int v : sums){
            //     System.out.println(v+" ");
            // }
            return sums[target];
        }
    }
}
