public class RotateArray {
        public void rotate(int[] nums, int k) {
            int len = nums.length;
            if(len==0) return;
            if(k>len) k = k%len;
            if(len%2==0 && k==len/2){
                int temp;
                for(int i=0;i<k;i++){
                    temp=nums[i];
                    nums[i]=nums[k+i];
                    nums[k+i] = temp;
                }
            }else{
                reverse(nums,0,len);
                reverse(nums,0,k);
                reverse(nums,k,len);
            }
        }

        public void reverse(int[] nums,int start,int end){
            int temp;
            int mid=(start+end)/2;
            int j=0;
            for(int i=start;i<mid;i++){
                temp=nums[i];
                nums[i]=nums[end-j-1];
                nums[end-j-1] = temp;
                j++;
            }
        }

    }

