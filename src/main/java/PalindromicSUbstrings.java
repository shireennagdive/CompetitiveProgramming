public class PalindromicSUbstrings {
    class Solution {
        int count=0;
        public int countSubstrings(String s){
            count = s.length();
            for(int i=1;i<s.length();i++){
                extend(i-1,i,s);
                extend(i-1,i+1,s);
            }
            return count;
        }

        public void extend(int start, int end, String s){
            while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
                count++;
                start--;
                end++;
            }
        }
    }
}
