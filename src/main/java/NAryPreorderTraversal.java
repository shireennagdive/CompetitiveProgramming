import java.util.ArrayList;
import java.util.List;

public class NAryPreorderTraversal {

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};


        public List<Integer> preorder(Node root) {
            List<Integer> res = new ArrayList<Integer>();
            getPreOrder(root,res);
            return res;
        }
        public void getPreOrder(Node node, List<Integer> result){
            if(node==null) return;
            result.add(node.val);
            for(Node child : node.children){
                getPreOrder(child,result);
            }
        }

}
