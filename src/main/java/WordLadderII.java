import java.util.*;

public class WordLadderII {
        List<List<String>> res;
        Set<String> dict;
        Map<String, List<String>> nodes;
        public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

            Set<String> currentLevel = new HashSet<>();
            currentLevel.add(beginWord);
            dict = new HashSet<>(wordList);
            res = new ArrayList<>();
            if(!dict.contains(endWord)) return res;
            boolean foundEnd=false;
            nodes = new HashMap<>();

            while(!currentLevel.isEmpty() && !foundEnd){
                Set<String> nextLevel = new HashSet<>();
                dict.removeAll(currentLevel);

                for(String str : currentLevel){

                    nodes.put(str,new ArrayList<>());

                    for(int i=0;i<str.length();i++){
                        char[] values = str.toCharArray();
                        for(char c='a';c<='z';c++){
                            values[i]=c;
                            String s = String.valueOf(values);
                            if(s.equals(endWord)) foundEnd = true;
                            if(dict.contains(s)){
                                nextLevel.add(s);
                                nodes.get(str).add(s);
                            }
                        }
                    }

                }
                currentLevel=nextLevel;
            }

            if(!foundEnd) return res;
            List<String> list = new ArrayList<>();
            list.add(beginWord);
            dfs(beginWord,list,endWord);
            return res;
        }

        public void dfs(String word, List<String> list, String endWord){
            if(word.equals(endWord)){
                res.add(new ArrayList<>(list));
                return;
            }
            if(nodes.containsKey(word)){
                for(String nextWord : nodes.get(word)){
                    list.add(nextWord);
                    dfs(nextWord,list,endWord);
                    list.remove(list.size()-1);
                }
            }
        }
}
