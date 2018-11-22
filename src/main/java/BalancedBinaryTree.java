public class BalancedBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null) return true;
            return getHeightDiff(root,0)>=0;
        }

        public int getHeightDiff(TreeNode node, int level){
            if(node==null) return level;
            int leftH  = getHeightDiff(node.left, level+1);
            int rightH = getHeightDiff(node.right, level+1);
            if(Math.abs(leftH-rightH) > 1 || leftH==-1 || rightH == -1)return -1;
            return Math.max(leftH,rightH);
        }
    }
}
