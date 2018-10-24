public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder n = new StringBuilder();
        char[] s1 = s.toCharArray();
        int i,j,x=32;
        char[] s2 = new char[s1.length];
        for(i=0,j=0;i<s1.length;i++){
            if((s1[i] >= 'a' && s1[i] <= 'z') || (s1[i] >= '0' && s1[i] <= '9') ){
                //System.out.println(s1[i]);
                s2[j++]= s1[i];
            }
            if(s1[i] >= 'A' && s1[i] <= 'Z'){
                s2[j++]= Character.toLowerCase(s1[i]);
            }
        }
        int lengthS2 = j;
        for(i=0,j=lengthS2-1;i<=j;i++,j--){
            if(s2[i]!=s2[j]){
                // System.out.println(s2[i]+" "+s2[j]);
                return false;
            }
        }
        return true;
    }
}
