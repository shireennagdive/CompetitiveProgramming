import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
        List<List<Integer>> res;
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            Arrays.sort(candidates);
            dfs(candidates,list,target,0);
            return res;
        }

        public void dfs(int[] candidates, List<Integer> list,int curr,int pos){
            if(curr < 0) return;
            if(curr==0){
                res.add(new ArrayList<>(list));
                return;
            }
            for(int i=pos;i<candidates.length;i++){
                list.add(candidates[i]);
                dfs(candidates,list,curr-candidates[i],i);
                list.remove(list.size()-1);
            }
        }
}
