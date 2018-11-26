public class FirstAndLastPositionOfElement {
        public int[] searchRange(int[] nums, int target) {
            if(nums.length==0) return new int[]{-1,-1};
            if(nums.length==1){
                if(target==nums[0]) return new int[]{0,0};
                return new int[]{-1,-1};
            }
            int[] result = new int[2];
            result[0] = getStart(nums,0,nums.length-1,target);
            result[1] = result[0]!=-1 ? getEnd(nums,result[0],nums.length-1,target) : -1;
            return result;
        }
        public int getStart(int[] nums, int low, int high,int target){
            while(low<high){
                int mid = (low+high)/2;
                if(nums[mid]==target){
                    if(mid==low || nums[mid-1] < nums[mid]){
                        return mid;
                    }else{
                        high=mid; //prev is same as target
                    }
                }else if(target > nums[mid]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }
            if(low==high && target==nums[low]){ return low;}
            return -1;
        }
        public int getEnd(int[] nums, int low, int high,int target){

            while(low<=high){
                int mid = (low+high)/2;
                if(nums[mid]==target){
                    if(mid==high || nums[mid+1] > nums[mid]){
                        return mid;
                    }else{
                        low=mid+1; //next is same as target
                    }
                }else if(target > nums[mid]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }
            return -1;
        }
}
