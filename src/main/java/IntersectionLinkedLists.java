public class IntersectionLinkedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA==null || headB==null) return null;
            int lenA = getLength(headA);
            int lenB = getLength(headB);
            int diff = lenA-lenB;
            if(diff > 0){
                while(diff!=0){
                    headA=headA.next;
                    diff-=1;
                }
            }else if(diff<0){
                while(diff<0){
                    headB=headB.next;
                    diff+=1;
                }
            }
            return getCommon(headA,headB);
        }
        public int getLength(ListNode headA){
            ListNode node = headA;
            int length=0;
            while(node!=null){
                node=node.next;
                length++;
            }
            return length;
        }
        public ListNode getCommon(ListNode headA, ListNode headB){
            while(headA!=null && headB!=null){
                if(headA.val == headB.val){
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
            return null;
        }
    }

