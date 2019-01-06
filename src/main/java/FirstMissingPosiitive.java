public class FirstMissingPosiitive {
        public int firstMissingPositive(int[] nums) {
            if(nums.length==0) return 1;
            int n=nums.length;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=0 || nums[i]>n) {
                    nums[i]=n+1;
                }
            }

            for(int i=0;i<n;i++){
                int val = Math.abs(nums[i]);
                if(val!=n+1 && nums[val-1]>0){
                    nums[val-1]*=-1;
                }
            }

            for(int i=0;i<n;i++){
                if(nums[i]>0) return i+1;
            }

            return n+1;
        }
    }
