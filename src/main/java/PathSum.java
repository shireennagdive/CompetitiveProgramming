public class PathSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public boolean hasPathSum(TreeNode root, int sum) {
            if(root==null) return false;
            return hasPathSum(root,0,sum);

        }
        public boolean hasPathSum(TreeNode node, int currSum, int sum) {
            if(node==null) return false;
            if(node.left==null && node.right==null){
                if(currSum + node.val == sum) return true;
                else return false;
            }else{
                return hasPathSum(node.left,currSum+node.val,sum) ||                          hasPathSum(node.right,currSum+node.val,sum) ;
            }
        }
}
