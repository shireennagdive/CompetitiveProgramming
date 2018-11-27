public class SearchInRotatedSortedArray {
        public int search(int[] nums, int target) {
            if(nums.length==0) return -1;
            int low=0,high=nums.length-1, min;
            min = getMinIndex(nums,0,nums.length-1);
            if(target>=nums[min] && target<=nums[high]){
                return binarySearch(nums,min,high,target);
            }else{
                return binarySearch(nums,low,min,target);
            }
        }
        public int binarySearch(int[] nums,int low, int high, int target){
            int mid;
            while(low<=high){
                mid = (low+high)/2;
                if(nums[mid]==target){
                    return mid;
                }else if(target > nums[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            return -1;
        }
        public int getMinIndex(int[] nums,int low,int high){
            if(nums.length==1 || nums[low] < nums[high]) return 0;
            int mid;
            while(low<high){
                mid=(low+high)/2;
                if(mid!=0 && mid!=nums.length-1 && nums[mid] > nums[mid-1]
                        &&  nums[mid] < nums[mid+1]){
                    if(nums[low] < nums[mid]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                } else if(mid!=0 && nums[mid] < nums[mid-1]) return mid;
                else if(mid!=nums.length-1 && nums[mid] > nums[mid+1]) return mid+1;
            }
            return -1;
        }
    }
