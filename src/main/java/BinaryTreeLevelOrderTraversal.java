import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTreeLevelOrderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Map<Integer,List<Integer>> map = new HashMap<>();
            levelWiseAdd(root,1,map);
            for(int i=1;i<=map.size();i++){
                res.add(map.get(i));
            }
            return res;
        }

        public void levelWiseAdd(TreeNode node, int level, Map<Integer,List<Integer>> map){
            if(node==null) return;

            levelWiseAdd(node.left,level+1,map);
            levelWiseAdd(node.right,level+1,map);

            if(!map.containsKey(level)){
                List<Integer> list = new ArrayList<>();
                map.put(level,list);
            }
            map.get(level).add(node.val);
        }
}
