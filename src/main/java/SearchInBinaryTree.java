public class SearchInBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public TreeNode searchBST(TreeNode root, int val) {
            if(root==null) return null; //see
            if(val==root.val){
                return root;
            }
            else if(val < root.val){
                return searchBST(root.left,val);
            }else{
                return searchBST(root.right,val);
            }
        }
}
