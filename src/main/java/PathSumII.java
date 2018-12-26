import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<List<Integer>> pathSum(TreeNode root, int sum) {

            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if(root==null) return result;
            List<Integer> list = new ArrayList<>();
            dfs(root,list,sum,result);
            return result;
        }

        public void dfs(TreeNode node, List<Integer> list, int sum, List<List<Integer>> result){
            if(node==null)   return;

            list.add(list.size(),node.val);

            if(node.left==null && node.right==null && node.val==sum){
                result.add(new ArrayList<>(list));
            }else{
                dfs(node.left,list,sum-node.val,result);
                dfs(node.right,list,sum-node.val,result);
            }
            list.remove(list.size()-1);
        }
}
