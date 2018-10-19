import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

class ReverseLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> levelWiseNodes = new HashMap<>();
        levelOrder(root, 1, levelWiseNodes);
        for(int i = levelWiseNodes.size();i>0;i--){
            result.add(levelWiseNodes.get(i));
        }
        return result;
    }

    public void levelOrder(TreeNode current, int level, Map<Integer, List<Integer>> levelWiseNodes){
        if (current == null) {return;}

        levelOrder(current.left,level+1,levelWiseNodes);
        levelOrder(current.right,level+1,levelWiseNodes);

        if(!levelWiseNodes.containsKey(level)){
            List<Integer> levelList = new ArrayList<>();
            levelList.add(current.val);
            levelWiseNodes.put(level,levelList);
        }else{
            levelWiseNodes.get(level).add(current.val);
        }

    }
}