public class PopulatingNextPointers {
    /**
     * Definition for binary tree with next pointer.
     * public class TreeLinkNode {
     *     int val;
     *     TreeLinkNode left, right, next;
     *     TreeLinkNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public void connect(TreeLinkNode root) {
            if(root==null) return;
            TreeLinkNode node = root;
            if(node.left!=null) node.left.next = node.right;
            if(node.right!=null && node.next!=null) node.right.next = node.next.left;
            connect(node.left);
            connect(node.right);
        }

    }
}
