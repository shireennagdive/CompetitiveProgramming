public class NextPermutation {
        public void nextPermutation(int[] nums) {
            int pivot=-1, nextMax=nums.length-1;
            for(int i=nums.length-1;i>=1;i--){
                if(nums[i-1]<nums[i]){
                    pivot = i-1;
                    break;
                }
            }

            if(pivot==-1){
                reverse(nums,0);
                return;
            }

            while(nextMax > pivot){
                if(nums[nextMax] > nums[pivot]){
                    break;
                }
                nextMax--;
            }

            swap(nums, pivot, nextMax);
            reverse(nums, pivot+1);
        }

        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        public void reverse(int nums[], int start){
            int end = nums.length;
            for(int i=start;i<(end+start)/2;i++){
                swap(nums, i, end-i-1 + start);
            }
        }
}
