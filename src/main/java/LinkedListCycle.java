//Flyods Algorithm


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode head = new ListNode(0);
        ListNode current = head;
        for (int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);
            current.next = node;
            current = node;
        }
        current.next = null;
        System.out.println(linkedListCycle.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        if (head != null && head.next == head) return true;
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
