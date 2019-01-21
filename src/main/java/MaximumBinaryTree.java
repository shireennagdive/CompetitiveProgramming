public class MaximumBinaryTree {
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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if(nums==null || nums.length==0) return null;
            return buildTree(0,nums.length-1,nums);
        }

        public TreeNode buildTree(int low, int high, int[] nums){
            if(low>nums.length-1 || high<0) return null;

            int[] values = getMaximum(nums,low,high);

            if(values[1]==-1) return null;

            TreeNode node = new TreeNode(values[0]);

            node.left = buildTree(low,values[1]-1,nums);
            node.right =  buildTree(values[1]+1,high,nums);
            return node;
        }

        public int[] getMaximum(int[] nums, int low, int high){
            int max=Integer.MIN_VALUE, index=-1;
            for(int i=low;i<=high;i++){
                if(nums[i] > max){
                    max = nums[i];
                    index = i;
                }
            }
            return new int[]{max,index};
        }

    }
}
