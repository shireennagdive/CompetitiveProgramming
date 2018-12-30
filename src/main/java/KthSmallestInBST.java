public class KthSmallestInBST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        int count=0,val;
        public int kthSmallest(TreeNode root, int k) {
            if(root==null) return -1;
            helper(root,k);
            return val;

        }

        public void helper(TreeNode node,int k){
            if(node==null) return;
            helper(node.left,k);
            count++;
            if(count ==  k){
                val=node.val;
                return;
            }
            helper(node.right,k);
        }
    }



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
class Solution {
    List<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        list = new ArrayList<>();
        helper(root,k);
        return list.get(list.size()-1);

    }

    public void helper(TreeNode node,int k){
        if(node==null) return;
        if(list.size() < k){
            helper(node.left,k);
            //   System.out.println(node.val);
            if(list.size() < k) list.add(node.val);
            helper(node.right,k);
        }
    }


}*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
class Solution {
    List<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        TreeNode node = root;
        int cnt=0;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.empty() || node!=null){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                node = stack.pop();
                cnt++;
                if(cnt==k) return node.val;
                node=node.right;
            }
        }
        return -1;

    }
}*/
