public class PopulatingNextPointerII {
    /**
     * Definition for binary tree with next pointer.
     * public class TreeLinkNode {
     *     int val;
     *     TreeLinkNode left, right, next;
     *     TreeLinkNode(int x) { val = x; }
     * }
     */
        public void connect(TreeLinkNode root) {
            if(root==null) return;
            TreeLinkNode node = root;

            if(node.left!=null){
                if(node.right!=null){
                    node.left.next = node.right;
                }else{
                    node.left.next = getNext(node);
                }
            }

            if(node.right!=null){
                node.right.next = getNext(node);
            }

            connect(node.right);
            connect(node.left);

        }

        public TreeLinkNode getNext(TreeLinkNode node){
            if(node==null) return null;
            if(node.next!=null && node.next.left!=null){
                return node.next.left;
            }

            if(node.next!=null && node.next.right!=null){
                return node.next.right;
            }

            return getNext(node.next);
        }
}
