import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            levelWiseAdd(root,0,res);
            return res;
        }

        public void levelWiseAdd(TreeNode node, int level, List<List<Integer>> res){
            if(node==null) return;
            if(res.size() <= level){
                res.add(new ArrayList<>());
            }
            res.get(level).add(node.val);

            levelWiseAdd(node.left,level+1,res);
            levelWiseAdd(node.right,level+1,res);

        }
}
