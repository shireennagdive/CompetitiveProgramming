public class PathSum3 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        int count=0;
        public int pathSum(TreeNode root, int sum) {
            int[] nodes = new int[1001];
            countPaths(root,nodes,sum,0);
            return count;
        }

        public void countPaths(TreeNode node,int[] nodes,int sum,int depth){
            if(node==null) return;
            nodes[depth] = node.val;
            int val=0;
            for(int i=depth;i>=0;i--){
                val += nodes[i];
                if(val==sum) count++;
            }
            countPaths(node.left,nodes,sum,depth+1);
            countPaths(node.right,nodes,sum,depth+1);
        }
    }
}
