import java.util.*;

public class PalindromePairs {
        public List<List<Integer>> palindromePairs(String[] words) {
            Map<String,Integer> map = new HashMap<>();
            List<List<Integer>> result = new ArrayList<>();
            int empty=-1;
            for(int i=0;i<words.length;i++){
                if(!words[i].equals("")) map.put(words[i],i);
                else{
                    empty=i;
                }
            }
            String p1,p2,rev;
            for(int i=0;i<words.length;i++){
                int k = words[i].length();
                for(int j=0;j<k;j++){
                    p1 = words[i].substring(0,j);
                    p2 = words[i].substring(j,k);

                    rev = new StringBuilder(p2).reverse().toString(); //rev=a
                    if(isPalindrome(p1) && map.containsKey(rev)){ //
                        if(i!=map.get(rev)) //
                            result.add(Arrays.asList(new Integer[]{map.get(rev),i}));
                    }

                    rev = new StringBuilder(p1).reverse().toString(); //""
                    if(isPalindrome(p2)){
                        if(map.containsKey(rev) && i!=map.get(rev)){ //a . ""
                            result.add(Arrays.asList(new Integer[]{i,map.get(rev)}));
                        }
                        if(empty!=-1 && p2.equals(words[i])){
                            result.add(Arrays.asList(new Integer[]{i,empty}));
                            result.add(Arrays.asList(new Integer[]{empty,i}));
                        }
                    }
                }

            }
            return result;
        }

        public boolean isPalindrome(String s){
            int n=s.length();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(n-1-i)) return false;
            }
            return true;
        }
}
