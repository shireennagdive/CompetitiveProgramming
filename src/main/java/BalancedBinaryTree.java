/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return getHeightDiff(root)>0;
    }

    public int getHeightDiff(TreeNode node){
        if(node==null) return 0;
        int left  = getHeightDiff(node.left);
        int right = getHeightDiff(node.right);
        if(Math.abs(left-right) > 1 || left==-1 || right==-1)return -1;
        return 1 + Math.max(left,right);
    }
}