import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        TreeMap<Integer, List<Integer>> map;
        public List<List<Integer>> verticalOrder(TreeNode root) {
            if(root==null) return new ArrayList<>();
            List<List<Integer>> res;
            Queue<TreeNode> queue = new LinkedList<>();
            Queue<Integer> width = new LinkedList<>();
            map = new TreeMap<>();
            int index, size;
            TreeNode node;
            queue.offer(root);
            width.offer(0);
            while(!queue.isEmpty()){
                size = queue.size();
                while(size>0){
                    index = width.poll();
                    node = queue.poll();
                    if(node.left!=null){
                        queue.offer(node.left);
                        width.offer(index-1);
                    }
                    if(node.right!=null) {
                        queue.offer(node.right);
                        width.offer(index+1);
                    }
                    if(!map.containsKey(index)){
                        map.put(index, new ArrayList<>());
                    }
                    map.get(index).add(node.val);
                    size--;
                }
            }
            res = new ArrayList<>(map.values());
            return res;
        }
    }
