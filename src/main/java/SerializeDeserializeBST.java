public class SerializeDeserializeBST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root==null) return "";
            StringBuilder sb = new StringBuilder();
            getPreOrder(root,sb);
            sb.setLength(sb.length()-1);
            return sb.toString();
        }

        public void getPreOrder(TreeNode node,StringBuilder sb){
            if(node==null) return;
            sb.append(node.val).append(",");
            getPreOrder(node.left,sb);
            getPreOrder(node.right,sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String key){
            if(key.equals("")) return null;
            String[] nodes = key.split(",");
            int[] index = new int[1];
            index[0]=0;
            return deserialize(index,nodes,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }

        public TreeNode deserialize(int[] index, String[] nodes, int low, int high){
            if(index[0]==nodes.length)  return null;
            int val = Integer.valueOf(nodes[index[0]]);
            if(val<low || val>high) return null; //true for 1

            TreeNode node = new TreeNode(Integer.valueOf(nodes[index[0]])); //create for 1
            index[0]++;//2
            node.left = deserialize(index,nodes,low,node.val);//null
            node.right = deserialize(index,nodes,node.val,high);//index[0]=2 return null
            return node;
        }

    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

