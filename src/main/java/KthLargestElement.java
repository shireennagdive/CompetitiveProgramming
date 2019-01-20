public class KthLargestElement {
        public int findKthLargest(int[] nums, int k) {
            k--;
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int p = partition(low, high, k, nums);
                if(p == k){break;}
                if(p<k){
                    low = p+1;
                }else{
                    high = p-1;
                }
            }
            return nums[k];
        }

        public int partition(int low, int high, int k, int[] nums){
            int pivotIndex = (low+high)/2;
            int pivot=nums[pivotIndex];
            swap(pivotIndex, high, nums);
            int i=low,j;
            for(j=low;j<high;j++){
                if(nums[j]>=pivot){
                    swap(i,j,nums);
                    i++;
                }
            }
            swap(i,j,nums);
            return i;
        }

        public void swap(int a,int b, int nums[]){
            int temp = nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    }
