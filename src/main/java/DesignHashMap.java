class DesignHashMap {
    class Node{
        int key;
        int val;
        Node next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
            this.next=null;
        }
    }
    Node[] buckets;
    /** Initialize your data structure here. */
    public DesignHashMap() {
        buckets = new Node[1000];
    }
    public int getHashCode(int key){
        return Integer.hashCode(key) % buckets.length;
    }
    public Node findPrevNode(Node head, int key){
        Node prev=null;
        Node curr=head;
        while(curr!=null && curr.key!=key){
            prev=curr;
            curr=curr.next;
        }
        return prev;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hashCode = getHashCode(key);
        System.out.println("hashCode"+hashCode);
        if(buckets[hashCode]==null){
            buckets[hashCode] = new Node(-1,-1);
        }
        Node prev = findPrevNode(buckets[hashCode], key);
        if(prev.next!=null){
            prev.next.val = value;
        }else{
            prev.next = new Node(key,value);
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashCode = getHashCode(key);
        if(buckets[hashCode]!=null){
            Node prev = findPrevNode(buckets[hashCode],key);
            System.out.println("prev.key"+prev.key+" "+prev.val);
            if(prev.next!=null){
                return prev.next.val;
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashCode = getHashCode(key);
        if(buckets[hashCode]!=null){
            Node prev = findPrevNode(buckets[hashCode],key);
            if(prev.next!=null){
                prev.next = prev.next.next;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */