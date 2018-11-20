public class FIndMinimumInSortedArray {
        public int findMin(int[] nums) {
            int low = 0,high = nums.length-1,mid=0;
            if(nums.length==1) return nums[0];
            if(nums[low] < nums[high]){
                return nums[low];
            }

            while(low<high){
                mid=(low+high)/2;
                if(mid!=0 && mid!=nums.length-1 && nums[mid] > nums[mid-1]
                        &&  nums[mid] < nums[mid+1]){
                    if(nums[low] < nums[mid]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                } else if(mid!=0 && nums[mid] < nums[mid-1]) return nums[mid];
                else if(mid!=nums.length-1 && nums[mid] > nums[mid+1]) return nums[mid+1];
            }
            return -1;
        }
    }

