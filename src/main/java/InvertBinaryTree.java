public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        invert(root);
        return root;
    }
    public void invert(TreeNode node){
        if(node==null)return;
        if(node.left==null && node.right==null)return;
        invert(node.left);
        invert(node.right);
        TreeNode temp = node.left;
        node.left=node.right;
        node.right=temp;

    }
}
