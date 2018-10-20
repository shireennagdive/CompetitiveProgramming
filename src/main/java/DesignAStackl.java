public class DesignAStackl {
        /** initialize your data structure here. */
        class Node{
            int min;
            int val;
            Node next;
            Node(int val,int min){
                this.val=val;
                this.min=min;
            }
        }

        Node head;

        public DesignAStackl() {

        }

        public void push(int x) {
            int min = x;
            if(head!=null){
                min = Math.min(head.min,x);
            }
            Node n = new Node(x,min);
            n.next = head;
            head = n;
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
