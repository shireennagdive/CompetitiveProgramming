import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
//
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> res = new ArrayList<Integer>();
            if(s.equals("") || p.length() > s.length() ) return res;
            int[] pattern = new int[26];
            int len = p.length(),i;
            int diff=p.length(); //unseen
            int front=0,end=0;
            char temp;
            for(char c : p.toCharArray()){
                pattern[c-'a']++;
            }
            while(end<p.length()){
                temp = s.charAt(end);
                pattern[temp-'a']--;
                if(pattern[temp-'a'] >= 0) diff--;
                end++;
            }
            if(diff==0) res.add(0);
            while(end<s.length()){
                temp = s.charAt(front);
                if(pattern[temp-'a']>=0) diff++;
                pattern[temp-'a']++;
                front++;
                temp = s.charAt(end);
                pattern[temp-'a']--;
                if(pattern[temp-'a']>=0) diff--;
                if(diff==0) res.add(front);
                end++;
            }
            return res;
        }
    }

