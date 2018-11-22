import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsInBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<Double> averageOfLevels(TreeNode root) {
            if (root == null) return new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            List<Double> result = new ArrayList<>();
            double sum;
            queue.offer(root);
            while (!queue.isEmpty()) {
                sum = 0;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode top = queue.poll();
                    sum += top.val;
                    if (top.left != null) queue.offer(top.left);
                    if (top.right != null) queue.offer(top.right);
                }
                result.add(sum / size);
            }
            return result;
        }
}
