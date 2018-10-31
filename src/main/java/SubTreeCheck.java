public class SubTreeCheck {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if(s==null) return false;

            return (checkIfEqual(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t));
        }

        public boolean checkIfEqual(TreeNode root, TreeNode node)
        {

            if(root==null && node==null) return true;
            if(root==null || node==null) {return false;}

            if(root.val==node.val){
                return checkIfEqual(root.left, node.left) && checkIfEqual(root.right, node.right);
            }
            return false;
        }
}
