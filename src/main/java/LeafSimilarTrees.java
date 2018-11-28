import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaves1 = getLeafSequence(root1,new ArrayList<>());
            List<Integer> leaves2 = getLeafSequence(root2,new ArrayList<>());
            if(leaves1.size()!=leaves2.size()) return false;
            for(int i=0;i<leaves1.size();i++){
                if(leaves1.get(i)!=leaves2.get(i)) return false;
            }
            return true;
        }
        public List<Integer> getLeafSequence(TreeNode node, List<Integer> leaves){
            if(node==null) return leaves;
            if(node.left==null && node.right==null){
                leaves.add(node.val);
                return leaves;
            }
            leaves = getLeafSequence(node.left,leaves);
            leaves = getLeafSequence(node.right,leaves);
            return leaves;
        }
}
