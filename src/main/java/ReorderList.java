public class ReorderList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public void reorderList(ListNode head){
            if(head==null) return;
            ListNode slow=head, fast=head,prev,tail,node,temp,curr,temp2;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast= fast.next.next;
            }

            curr = slow.next;
            slow.next = null;
            prev = null;


            while(curr!=null){
                temp = curr.next;
                curr.next = prev;

                prev = curr;
                curr=temp;
            }


            node = head;
            tail = prev;

            while(node!=null && tail!=null){
                temp = node.next;
                node.next = tail;
                node = tail;
                tail = temp;
            }

        }
}
