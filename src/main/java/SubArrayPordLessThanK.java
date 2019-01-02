public class SubArrayPordLessThanK {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(nums.length==0 || k<=1) return 0;
            int product=1,i=0,j,cnt=0;
            for(j=0;j<nums.length;j++){
                product*=nums[j];
                while(product>=k){
                    product/=nums[i];
                    i++;
                }
                cnt+=j-i+1;
            }
            return cnt;
        }
    }
