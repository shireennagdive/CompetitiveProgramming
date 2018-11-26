import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> res = new ArrayList<Integer>();
            if(s.equals("") || p.length() > s.length() ) return res;
            int[] pattern = new int[26];
            int len = p.length(),i;
            int front=0,end=len-1;
            for(char c : p.toCharArray()){
                pattern[c-'a']++;
            }
            for(i=front;i<=end;i++){
                pattern[s.charAt(i)-'a']--;
            }
            while(end<s.length()){
                for(i=front;i<=end;i++) {
                    if(pattern[s.charAt(i) - 'a']!=0) break;
                }
                if(i==end+1) res.add(front);
                pattern[s.charAt(front) - 'a']++;
                front++;end++;
                if(end!=s.length())pattern[s.charAt(end) - 'a']--;
            }
            return res;
        }
    }
