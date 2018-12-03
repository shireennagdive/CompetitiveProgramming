import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryPreOrderIterative {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode node = root;
            while (node.left != null) {
                stack.push(node.left);
                node = node.left;
            }
            while (!stack.isEmpty()) {
                node = stack.pop();
                result.add(node.val);
                if (node.right != null) {
                    node = node.right;
                    if (node != null) stack.push(node);
                    while (node.left != null) {
                        stack.push(node.left);
                        node = node.left;
                    }
                }
            }
            return result;
        }
}
