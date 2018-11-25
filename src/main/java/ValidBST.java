public class ValidBST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public boolean isValidBST(TreeNode root) {
            return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
        }

        public boolean isBST(TreeNode node,long low,long high){
            if(node==null) return true;
            if(node.val <= low ||  node.val >= high) return false;
            return isBST(node.left,low,node.val) && isBST(node.right,node.val,high);
        }

}
