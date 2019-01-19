
//Definition for singly-linked list with a random pointer.
class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};

public class CopyList{
    public RandomListNode copyRandomList(RandomListNode head) {

        if(head==null) return null;
        RandomListNode curr = head,temp;

        RandomListNode newHead = new RandomListNode(-1);
        RandomListNode copy=head.next;

        while(curr!=null){
            System.out.println(curr.label);
            RandomListNode node = new RandomListNode(curr.label);
            copy = curr.next;
            curr.next = node;
            node.next = copy;
            curr=copy;

        }

        curr=head;

        while(curr!=null){
            temp = curr.random;
            if(temp!=null) curr.next.random = temp.next;
            curr = curr.next.next;
        }


        curr = head;
        RandomListNode copyIter = newHead;
        copy = newHead;

        while(curr!=null){
            temp = curr.next.next;

            copy = curr.next;
            copyIter.next = copy;
            copyIter = copy;

            curr.next = temp;
            curr=curr.next;
        }

        return newHead.next;
    }
}