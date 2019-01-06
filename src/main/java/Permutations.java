import java.util.ArrayList;
import java.util.List;

class Permutations {
    List<List<Integer>> res;
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        visited = new boolean[nums.length];
        dfs(nums, list);
        return res;
    }

    public void dfs(int[] nums, List<Integer> list){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(nums[i]);
                dfs(nums, list);
                list.remove(list.size()-1);
                visited[i]= false;
            }
        }
    }
}