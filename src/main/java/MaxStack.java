public class MaxStack {
    /**
     * initialize your data structure here.
     */
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head = null;
    int max = Integer.MIN_VALUE;

    public MaxStack() {
    }

    public void push(int x) {
        Node node = new Node(x);
        node.next = head;
        head = node;
        if (max == Integer.MIN_VALUE) {
            max = head.val;
        } else if (node.val > max) {
            max = node.val;
        }
    }

    public int pop() {
        if (head == null) return -1;
        int val = head.val;
        head = head.next;
        max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.val > max) {
                max = temp.val;
            }
            temp = temp.next;
        }
        return val;
    }

    public int top() {
        return head.val;
    }

    public int peekMax() {
        return max;
    }

    public int popMax() {
        Node prev = null;
        Node curr = head;
        int val = max;
        Node temp = head;
        if (head.val == max) {
            head = head.next;
        } else {
            while (curr.val != max) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
        max = Integer.MIN_VALUE;
        temp = head;
        while (temp != null) {
            if (temp.val > max) {
                max = temp.val;
            }
            temp = temp.next;
        }
        return val;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */

