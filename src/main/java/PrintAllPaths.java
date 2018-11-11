import java.util.ArrayList;
import java.util.List;

public class PrintAllPaths {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            getPaths(path, root, paths,0);
            return paths;
        }

        public void getPaths(List<Integer> list,TreeNode node, List<String> paths,int index){
            if(node == null) return;
            if(node.left==null && node.right==null){
                StringBuilder path = new StringBuilder();
                for(int i=0; i<list.size();i++){
                    path.append(list.get(i)).append("->");
                }
                path.append(node.val);
                paths.add(path.toString());
                return;
            }
            list.add(index, node.val);
            getPaths(list, node.left,paths,index+1);
            getPaths(list, node.right,paths,index+1);
            list.remove(index);
        }
}
