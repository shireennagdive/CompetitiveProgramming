public class SumOfLeftLeaves {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public int sumOfLeftLeaves(TreeNode root) {
            if(root==null) return 0;
            return findSum(root,0,false);
        }
        public int findSum(TreeNode node, int sum, boolean isLeft){
            if(node==null) return sum;
            if(node.left==null && node.right==null && isLeft){
                sum+=node.val;
            }
            if(node.left!=null)sum = findSum(node.left,sum,true);
            if(node.right!=null)sum = findSum(node.right,sum,false);
            return sum;
        }
}
