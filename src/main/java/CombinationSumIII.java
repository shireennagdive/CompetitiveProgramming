import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIII {
        List<List<Integer>> res;
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            dfs(candidates, list, target,0);
            return res;
        }

        public void dfs(int[] candidates, List<Integer> list, int curr,int pos){
            if(curr<0) return;
            if(curr==0){
                res.add(new ArrayList<>(list));
            }
            for(int i=pos;i<candidates.length;i++){
                if(!(i>pos && (candidates[i]==candidates[i-1]))){
                    list.add(candidates[i]);
                    dfs(candidates, list, curr-candidates[i], i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }
