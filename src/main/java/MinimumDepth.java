public class MinimumDepth {
    public int minDepth(TreeNode root) {
        if (root != null) {
            if(root.left==null && root.right==null) return 1;
            else if(root.left==null)  return 1 + minDepth(root.right);
            else if(root.right==null) return 1 + minDepth(root.left);
            else return 1 + Math.min(minDepth(root.left),minDepth(root.right));
        }
        return 0;
    }
}
