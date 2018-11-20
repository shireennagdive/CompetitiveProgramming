public class BackSpaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int i,count=0;
        char ch;
        for(i=S.length()-1;i>=0;i--){
            ch=S.charAt(i);
            if(ch == '#'){
                count++;
            }else if(count==0){
                s1.append(ch);
            }else if(count>0){
                count--;
            }
        }
        count=0;
        for(i=T.length()-1;i>=0;i--){
            ch=T.charAt(i);
            if(ch == '#'){
                count++;
            }else if(count==0){
                s2.append(ch);
            }else if(count>0){
                count--;
            }
        }

        return s1.toString().equals(s2.toString());
    }
}
