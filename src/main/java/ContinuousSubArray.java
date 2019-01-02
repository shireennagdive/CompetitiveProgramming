import java.util.HashSet;
import java.util.Set;

public class ContinuousSubArray {
        public boolean checkSubarraySum(int[] nums, int k) {
            if(nums.length<2) return false;
            if(k==1) return true;
            if(k==0){
                int cnt=0;
                for(int i=1;i<nums.length;i++){
                    if(nums[i-1] == nums[i] && nums[i]==0) return true;
                }
                return false;
            }

            k=Math.abs(k);
            Set<Integer> set = new HashSet<Integer>();
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(set.contains(sum%k)){
                    return true;
                }
                set.add(sum%k);
            }
            return sum%k==0;
        }
    }


