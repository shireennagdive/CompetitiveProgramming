import java.util.*;

public class TopKFrequentWordsII {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String,Integer> map = new HashMap<>();

            List<String> res = new ArrayList<>();
            for(String word : words){
                map.put(word,map.getOrDefault(word,0)+1);
            }

            PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>(){
                public int compare(String a, String b){
                    return (map.get(a)==map.get(b) ? a.compareTo(b) : map.get(b) - map.get(a));
                }
            });

            for(String word : map.keySet()){
                queue.offer(word);
            }

            while(k!=0){
                res.add(queue.poll());
                k--;
            }
            return res;
        }
    }

