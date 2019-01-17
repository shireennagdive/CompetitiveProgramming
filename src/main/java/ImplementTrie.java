class Node{
    Node next[];
    String value;
    Node(){
        next = new Node[26];
    }
}
public class ImplementTrie {

    /** Initialize your data structure here. */
    Node root;
    public ImplementTrie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word){
        Node node = root;
        for(char c : word.toCharArray()){
            if(node.next[c-'a']==null) node.next[c-'a'] = new Node();
            node=node.next[c-'a'];
        }
        node.value = word;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node node = root;
        for(char c : word.toCharArray()){
            if(node.next[c-'a']==null) return false;
            node = node.next[c-'a'];
        }
        return node.value!=null;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node node = root;
        for(char c : prefix.toCharArray()){
            if(node.next[c-'a']==null) return false;
            node = node.next[c-'a'];
        }
        return true;
    }

//   public static void main(String[] args){
//     Solution obj = new Solution();
//     obj.insert("shireen");
//     System.out.println( obj.search("shireen"));
//      System.out.println( obj.startsWith("shi"));

//   }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */