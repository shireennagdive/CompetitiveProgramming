import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderIterative {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if(root==null) return result;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode node;
            while(!stack.isEmpty()){
                node = stack.pop();
                if(node!=null){
                    result.add(node.val);
                    stack.push(node.right);
                    stack.push(node.left);
                }
            }
            return result;
    }
}
