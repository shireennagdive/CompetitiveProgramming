public class VerifyinhAlienDictionary {
        public boolean isAlienSorted(String[] words, String order) {
            if(words.length==0 || words.length==1) return true;


            int i,j;
            for(int k=0;k<words.length-1;k++){
                String word1 = words[k];
                String word2 = words[k+1];
                for(i=0,j=0;i<word1.length() && j<word2.length();i++,j++){
                    if(word1.charAt(i)!=word2.charAt(j)){
                        break;
                    }
                }
                if(j==word2.length() && i<word1.length()) return false;

                else if(i<word1.length() &&
                        (order.indexOf( word1.charAt(i) ) > order.indexOf( word2.charAt(j) ))){
                    return false;
                }
            }
            return true;
        }
}
