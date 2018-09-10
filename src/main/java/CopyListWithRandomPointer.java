import java.util.HashMap;
import java.util.Map;


class RandomListNode {
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        this.label = x;
    }
};

public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode node = head;
        while (node != null) {
            nodeMap.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while (node != null) {
            nodeMap.get(node).next = nodeMap.get(node.next);
            nodeMap.get(node).random = nodeMap.get(node.random);
            node = node.next;
        }
        return nodeMap.get(head);

    }

    public static void main(String[] args) {
        RandomListNode head = new RandomListNode(0);
        int n = 10, i = 1;
        RandomListNode node = head;
        while (i <= n) {
            node.next = new RandomListNode(i);
            node.random = node.next;
            node = node.next;
            i++;
        }
        node.next = null;
        CopyListWithRandomPointer sol = new CopyListWithRandomPointer();
        System.out.println(sol.copyRandomList(head));

    }
}

