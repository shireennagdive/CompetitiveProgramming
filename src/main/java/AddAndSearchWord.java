

class WordDictionary {

    /** Initialize your data structure here. */
    class Node{
        Node next[];
        String value;
        Node(){
            next = new Node[26];
        }
    }

    Node root;
    public WordDictionary(){
        root = new Node();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word){
        Node node = root;
        for(char c : word.toCharArray()){
            if(node.next[c-'a']==null) node.next[c-'a'] = new Node();
            node = node.next[c-'a'];
        }
        node.value = word;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word){
        return helper(root,word,0);
    }

    private boolean helper(Node node, String word, int index){
        if(index == word.length()){
            return node!=null && node.value!=null;
        }
        char c = word.charAt(index);
        if(c=='.'){
            for(int i=0;i<26;i++){
                if(node.next[i]!=null && helper(node.next[i],word,index+1)){
                    return true;
                }
            }

        }else{
            if(node.next[c-'a']!=null && helper(node.next[c-'a'],word,index+1)) return true;

        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */