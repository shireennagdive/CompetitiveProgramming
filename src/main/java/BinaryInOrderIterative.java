import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryInOrderIterative {
//     public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//         if(root==null) return result;
//        Stack<TreeNode> stack = new Stack<>();

    //            while(!stack.isEmpty()){
//            node = stack.pop();
//            result.add(node.val);
//             if(node.right!=null){
//                 node=node.right;
//                 if(node!=null)  stack.push(node);
//                 while(node.left!=null){
//                     stack.push(node.left);
//                     node=node.left;
//                 }
//            }
//     }
//        return result;
//     }
    //Bit Clean and simple code below





    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }else{
                curr=stack.pop();
                res.add(curr.val);
                curr=curr.right;
            }
        }
        return res;
    }
}