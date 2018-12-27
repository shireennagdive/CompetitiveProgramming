import java.util.ArrayList;
import java.util.List;

public class Subsets {
        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> list = new ArrayList<>();
            result.add(list);
            backTrack(nums,list,0);
            return result;
        }

        public void backTrack(int[] nums, List<Integer> list, int position){
            for(int i=position;i<nums.length;i++){
                List<Integer> list1 = new ArrayList<>(list);
                list1.add(nums[i]);
                result.add(list1);
                backTrack(nums, list1, i+1);
            }
        }
}
