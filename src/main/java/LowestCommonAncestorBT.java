public class LowestCommonAncestorBT {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
            if(node==null || node==p || node==q) return node;
            TreeNode a = lowestCommonAncestor(node.left,p,q);
            TreeNode b = lowestCommonAncestor(node.right,p,q);

            if(a!=null && b!=null) return node;
            return (a==null) ? b : a;
    }
}
