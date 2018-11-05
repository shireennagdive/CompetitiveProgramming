public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
//    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode(-1);
            ListNode currl3 = l3;
            int carry=0,x,y,sum;
            while(l1!=null || l2!=null || carry==1){
                x = (l1!=null) ? l1.val : 0;
                y = (l2!=null) ? l2.val : 0;
                sum=x+y+carry;
                carry=(sum)/10;
                ListNode temp = new ListNode(sum%10);
                currl3.next=temp;
                currl3=temp;
                if(l1!=null)l1=l1.next;
                if(l2!=null)l2=l2.next;
            }
            return l3.next;
        }

}
