import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<Integer> rightSideView(TreeNode root) {

            List<Integer> res = new ArrayList<>();
            if(root==null) return res;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int size = queue.size(),i=0;
                while(i<size){
                    TreeNode node = queue.poll();
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                    if(i==size-1){
                        res.add(node.val);
                    }
                    i++;
                }
            }

            return res;
        }
}
