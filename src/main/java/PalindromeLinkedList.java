public class PalindromeLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public boolean isPalindrome(ListNode head) {
            int length = getLength(head);
            if(length==1) return true;
            ListNode head2=null,temp=head;
            int count=0;
            while(temp!=null && count<=length){
                count++;
                if(count==(length/2)){
                    if(length%2==0){
                        head2 = reverseList(temp.next);
                        temp.next=null;
                        break;
                    }else{
                        head2 = reverseList(temp.next.next);
                        temp.next=null;
                        break;
                    }
                }
                temp=temp.next;
            }

            while(head!=null && head2!=null){
                if(head.val!=head2.val) return false;
                head=head.next;
                head2=head2.next;
            }
            return (head==null && head2==null) ;
        }

        public int getLength(ListNode head){
            int count=0;
            ListNode temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        public ListNode reverseList(ListNode head){
            ListNode curr=head,prev=null,temp;
            while(curr!=null){
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }
    }
