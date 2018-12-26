public class ClosestBinarySearch {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        static int closest;
        public int closestValue(TreeNode root, double target) {
            closest = root.val;
            getClosest(root,target);
            return closest;
        }

        public static void getClosest(TreeNode node, double target){
            if(node==null) return;

            if(target>node.val){
                if(Math.abs(target-node.val) < Math.abs(closest-target)) closest = node.val;

            }else{
                if(Math.abs(node.val-target) < Math.abs(closest-target)) closest = node.val;
            }
            getClosest(node.left,target);
            getClosest(node.right,target);

        }

    }
