import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root==null) return res;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int size,level=0;
            while(!queue.isEmpty()){
                List<Integer> list = new ArrayList<>();
                size=queue.size();
                for(int i=0;i<size;i++){
                    TreeNode node = queue.poll();
                    if(level%2==0) list.add(node.val);
                    else list.add(0,node.val);
                    if(node.left!=null)queue.offer(node.left);
                    if(node.right!=null)queue.offer(node.right);
                }
                level++;
                res.add(list);
            }
            return res;
        }
    }
}
