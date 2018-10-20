public class DiameterOfBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int rootDiameter = 0;
        rootDiameter = getHeight(root.left) + getHeight(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public int getHeight(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
