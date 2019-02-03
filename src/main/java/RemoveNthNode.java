public class RemoveNthNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

        public ListNode removeNthFromEnd(ListNode head, int n) {
            int len = getLength(head);
            if(len==1 && n==1) return null;
            int k = len-n;

            if(k==0){
                head=head.next;
                return head;
            }

            int i=0;
            ListNode curr = head,prev=null;
            while(i<k){
                prev=curr;
                curr=curr.next;
                i++;
            }
            prev.next=curr.next;
            return head;
        }

        public int getLength(ListNode head){
            ListNode curr=head;
            int len=0;
            while(curr!=null){
                len++;
                curr=curr.next;
            }
            return len;
        }
}
