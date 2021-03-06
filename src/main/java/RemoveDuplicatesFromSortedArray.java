public class RemoveDuplicatesFromSortedArray {
        public int removeDuplicates(int[] nums) {
            if(nums.length==0) return 0;
            int j=1,i=1;
            while(j<nums.length){
                while(j<nums.length && nums[j-1]==nums[j]){
                    j++;
                }
                if(j<nums.length && i<nums.length ){
                    nums[i]  = nums[j];
                    i++;
                    j++;
                }
            }
            //Arrays.copyOfRAnge(nums,0,k)
            return i;
        }

        /*
        Cleaner code
        public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]!=nums[j]){
               nums[i]  = nums[j];
               i++;
            }
        }
        return i;
    }*/
    }
