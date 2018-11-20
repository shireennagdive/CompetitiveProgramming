public class BackSpaceStringCompare {
        public boolean backspaceCompare(String S, String T) {
            return removeSpaces(S).toString().equals(removeSpaces(T).toString());
        }
        public static StringBuilder removeSpaces(String S){
            int count=0;
            char ch;
            StringBuilder s1 = new StringBuilder();
            for(int i=S.length()-1;i>=0;i--){
                ch=S.charAt(i);
                if(ch == '#'){
                    count++;
                }else if(count==0){
                    s1.append(ch);
                }else if(count>0){
                    count--;
                }
            }
            return s1;
        }

    }
