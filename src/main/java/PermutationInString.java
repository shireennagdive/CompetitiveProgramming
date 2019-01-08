import java.util.Arrays;

public class PermutationInString {
        public boolean checkInclusion(String s1, String s2) {
            if(s1.length() > s2.length()) return false;
            int[] map1 = new int[26];
            int[] map2 = new int[26];
            int i=0,start=0,end=s1.length();
            for(char c : s1.toCharArray()){
                map1[c-'a']++;
            }
            while(i<end){
                map2[s2.charAt(i)-'a']++;
                i++;
            }

            while(end<s2.length()){
                if(Arrays.equals(map1,map2)) return true;
                map2[s2.charAt(end)-'a']++;
                map2[s2.charAt(start)-'a']--;
                start++;
                end++;
            }

            return Arrays.equals(map1,map2);
        }
    }
