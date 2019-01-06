import java.util.*;

public class AlienDictionary {
        public String alienOrder(String[] words) {
            List<Character>[] adjacencyList = new List[26];
            int[] indegree = new int[26];
            boolean[] visited = new boolean[26];
            Queue<Character> queue = new LinkedList<>();
            StringBuilder sb = new StringBuilder();
            String word1, word2;
            Character c1,c2;
            int len=0;
            Arrays.fill(indegree, -1);
            for(String s : words){
                for(char c : s.toCharArray()){
                    if(indegree[c-'a']<0) indegree[c-'a']=0;
                }
            }

            for(int i=0;i<words.length-1;i++){
                word1 = words[i];
                word2 = words[i+1];
                len = Math.min(word1.length(),word2.length());
                for(int j=0;j<len;j++){
                    c1=word1.charAt(j);
                    c2=word2.charAt(j);
                    if(c1 != c2 ){
                        if(adjacencyList[c1-'a']==null){
                            adjacencyList[c1-'a'] = new ArrayList<>();
                        }
                        if(!adjacencyList[c1-'a'].contains(c2)){
                            adjacencyList[c1-'a'].add(c2);
                            indegree[c2-'a']++;
                        }
                        break;
                    }
                    if (j == word2.length() - 1 && word1.length() > word2.length()) {
                        return "";
                    }
                }
            }
            for(int i=0;i<26;i++){
                if(indegree[i]==0){
                    //   System.out.println((char)(i+'a'));
                    queue.add((char)(i+'a'));
                }
            }

            while(!queue.isEmpty()){
                char c = queue.poll();
                sb.append(c);
                if(adjacencyList[c-'a']!=null){
                    for(char d : adjacencyList[c-'a']){
                        indegree[d-'a']--;
                        if(indegree[d-'a']==0){
                            queue.offer(d);
                        }
                    }
                }
            }

            for (int i=0;i<26;i++) {
                if (indegree[i]>0) {
                    return "";
                }
            }
            return sb.toString();
        }
}
