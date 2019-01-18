import java.util.*;

public class WordLadder {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> dict = new HashSet<>(wordList);

            Queue<String> queue = new LinkedList<>();
            if(!dict.contains(endWord)) return 0;

            String  str;
            int level = 1;
            queue.offer(beginWord);
            queue.offer("-1");
            while(!queue.isEmpty()){
                str = queue.poll();

                if(!str.equals("-1")){

                    for(int i=0;i<str.length();i++){
                        char[] value = str.toCharArray();
                        for(char c='a';c<='z';c++){

                            value[i]=c;
                            String word = String.valueOf(value);

                            if(word.equals(endWord)){

                                return level+1;
                            }

                            if(dict.contains(word)){

                                queue.offer(word);
                                dict.remove(word);
                            }

                        }
                    }
                }else{
                    level++;
                    if(!queue.isEmpty()){
                        queue.offer("-1");
                    }
                }
            }

            return 0;

        }
    }
}
