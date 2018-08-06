package main.java;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        int tree[] = {3, 9, 20, -1, -1, 15, 7};
        TreeNode root = buildTreeFromLevelOrder(tree, 0);
        System.out.println(maxDepth(root));
    }


    public static int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return 0;
    }

    public static TreeNode buildTreeFromLevelOrder(int[] tree, int pos) {

        if (pos < tree.length && tree[pos] != -1) {
            TreeNode node = new TreeNode(tree[pos]);
            node.left = buildTreeFromLevelOrder(tree, 2 * pos + 1);
            node.right = buildTreeFromLevelOrder(tree, 2 * pos + 2);
            return node;
        }
        return null;
    }

}
