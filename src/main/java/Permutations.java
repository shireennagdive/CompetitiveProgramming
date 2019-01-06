import java.util.ArrayList;
import java.util.List;

public class Permutations {
        List<List<Integer>> res;
        public List<List<Integer>> permute(int[] nums) {
            res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            dfs(nums, list);
            return res;
        }

        public void dfs(int[] nums, List<Integer> list){
            if(list.size()==nums.length){
                res.add(new ArrayList<>(list));
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                    System.out.println(nums[i]);
                    dfs(nums, list);
                    list.remove(list.size()-1);
                }

            }
        }
    }
