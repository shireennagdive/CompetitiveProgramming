import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums.length<3) return result;
            List<Integer> list;
            Arrays.sort(nums);
            int sum=0,low,high;
            for(int i=0;i<nums.length;i++){
                if(i!=0 && nums[i]==nums[i-1]) continue;
                low=i+1;high=nums.length-1;
                sum=-1*nums[i];
                while(low<high){
                    if(nums[low] + nums[high]==sum){
                        list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        result.add(list);
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;
                    }else if(nums[low] + nums[high]<sum){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
            return result;
        }
    }
