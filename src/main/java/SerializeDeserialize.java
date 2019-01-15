public class SerializeDeserialize {
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
            // System.out.println(sb.toString());
            return sb.toString();
        }

        public void getPreOrder(TreeNode node, StringBuilder sb){
            if(node==null){
                sb.append("#").append(",");
                return;
            }

            sb.append(node.val).append(",");
            getPreOrder(node.left,sb);
            getPreOrder(node.right,sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String key) {
            if(key.equals("")) return null;
            String[] nodes = key.split(",");
            int[] index = new int[1];
            index[0]=0;
            return deserialize(index, nodes);
        }

        public TreeNode deserialize(int[] index, String[] nodes){

            if(index[0]==nodes.length)  return null;

            if(nodes[index[0]].equals("#")){
                index[0]++;
                return null;
            }

            int val = Integer.valueOf(nodes[index[0]]);
            index[0]++;

            TreeNode node = new TreeNode(val);


            node.left = deserialize(index,nodes);
            node.right = deserialize(index,nodes);
            return node;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

