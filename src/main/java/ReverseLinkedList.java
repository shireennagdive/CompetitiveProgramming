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
//Recursive Solution
    /*public ListNode reverseList(ListNode head) {
        ListNode current = head;
        head=reverse(current,head);
        return head;
    }
    public ListNode reverse(ListNode current,ListNode head) {
        if(current==null){  return null;}
        if(current.next==null){head = current; return head;}
        head=reverse(current.next,head);
        current.next.next=current;
        current.next=null;
        return head;
    }*/

}
