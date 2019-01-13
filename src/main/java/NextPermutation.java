class NextPermutation {
    public void nextPermutation(int[] nums) {
        int pivot, nextMax=nums.length-1;
        int i=nums.length-1;
        while(i>=1 && nums[i-1]>=nums[i]) i--;

        pivot=i-1;

        if(i==-1){
            reverse(nums,0,nums.length-1);
            return;
        }

        while(nums[nextMax]<=nums[pivot]){
            nextMax--;
        }

        swap(nums, pivot, nextMax);
        reverse(nums, pivot+1,nums.length-1);
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int nums[], int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}