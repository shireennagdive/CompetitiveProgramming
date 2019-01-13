import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
        static List<List<Integer>> res;
        static boolean visited[];
        public static List<List<Integer>> permuteUnique(int[] nums) {
            res = new ArrayList<>();
            if(nums.length==0) return res;
            Arrays.sort(nums);
            visited = new boolean[nums.length];
            dfs(nums, new ArrayList<>(), 0);
            return res;
        }

        public static  void dfs(int[] nums, List<Integer> list, int pos){
            if(list.size()==nums.length){
                res.add(new ArrayList<>(list));
                System.out.println("added "+list);
                return;

            }

            for(int i=0;i<nums.length;i++){
                if(!visited[i]){
                    if (i > 0 && nums[i] == nums[i-1] && visited[i-1]) {
                        return;
                    }
                    visited[i]=true;
                    list.add(nums[i]);
                    dfs(nums,list,i);
                    list.remove(list.size()-1);
                    visited[i]=false;


                }
            }
        }

    public static void main(String[] args) {
        permuteUnique(new int[]{1,1,2});
    }
}


