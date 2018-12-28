public class ConvertBSTToDoublyLinkList {

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    ;

    class Solution {
        Node tail;

        public Node treeToDoublyList(Node root) {
            if (root == null) return null;
            Node first = new Node(0, null, null);
            tail = first;
            inOrder(root);
            first.right.left = tail;
            tail.right = first.right;
            return first.right;
        }

        public void inOrder(Node node) {
            if (node == null) return;
            inOrder(node.left);
            tail.right = node;
            node.left = tail;
            tail = node;
            inOrder(node.right);
        }

    }
}
/*
class Solution {
    Node head=null,tail=null;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        inOrder(root);
        head.left=tail;
        tail.right=head;
        return head;
    }

    public void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.right=node;
            node.left=tail;
            tail=node;
        }
        inOrder(node.right);
    }
}*/

