public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, currentNode = head, tempNode;
        while (currentNode != null) {
            tempNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = tempNode;
        }
        head = prev;
        return prev;
    }

}
