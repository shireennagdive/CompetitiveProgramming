public class RemoveNodeElementsLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        while(head!=null && head.val==val){
            head=head.next;
            if(head==null)return null;
        }
        ListNode curr = head;
        ListNode prev = head;
        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
                curr=prev.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
