public class SymmetricTree {
        public boolean isSymmetric(TreeNode root) {
            return isSymmetricTree(root, root);
        }
        public boolean isSymmetricTree(TreeNode node1, TreeNode node2){
            if(node1 == null && node2 == null)return true;
            if(node1!=null && node2!=null && (node1.val == node2.val))
                return (isSymmetricTree(node1.left, node2.right) &&
                        isSymmetricTree(node1.right, node2.left));
            return false;
        }
    }
