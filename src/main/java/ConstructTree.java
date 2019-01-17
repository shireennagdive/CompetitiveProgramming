public class ConstructTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public TreeNode buildTree(int[] preorder, int[] inorder){
            return build(0, 0, inorder.length,preorder,inorder);
        }

        public TreeNode build(int preInd, int inStart, int inEnd, int[] preorder, int[] inorder){
            if(preInd > preorder.length-1 || inStart > inEnd) return null;

            TreeNode node = new TreeNode(preorder[preInd]);
            int nodeIndex=0;

            for(int i=inStart;i<inorder.length;i++){
                if(inorder[i]==node.val){
                    nodeIndex = i;
                }
            }
            node.left = build(preInd+1, inStart, nodeIndex - 1, preorder,inorder);
            node.right = build(preInd + nodeIndex - inStart + 1 , nodeIndex+1, inEnd, preorder, inorder);
            return node;
    }
}
