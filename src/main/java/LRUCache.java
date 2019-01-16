import java.util.HashMap;
import java.util.Map;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
class Node{
    Node pre;
    Node next;
    int key;
    int value;
    Node(){
        this.pre = null;
        this.next = null;
    }
}

class LRUCache {

    Map<Integer, Node> map;
    int capacity,curr;
    Node head,tail;

    public LRUCache(int capacity){
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        head.pre = null;
        tail.pre = head;
        tail.next = null;
        this.curr=0;
    }

    private void removeNode(Node node){
        Node prev = node.pre;
        Node next = node.next;

        prev.next = next;
        next.pre = prev;
    }

    private void addToFirst(Node node){
        node.pre = head;
        node.next = head.next;

        head.next.pre = node;
        head.next = node;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        this.removeNode(node);
        this.addToFirst(node);
        return node.value;
    }

    public void put(int key, int value){
        Node node = map.get(key);
        if(node==null){
            node = new Node();
            node.key=key;
            node.value=value;
            curr++;
            map.put(key,node);
            this.addToFirst(node);

            if(curr>capacity){
                this.map.remove(tail.pre.key);
                this.removeNode(tail.pre);
                curr--;
            }
        }
        else{
            node.value=value;
            this.removeNode(node);
            this.addToFirst(node);
        }
    }

}
