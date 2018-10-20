public class ReverseStringsIII {
        public String reverseWords(String s) {
            char[] charArray = s.toCharArray();
            int end, i=0;
            char c;
            while(i<s.length()){
                c = charArray[i];
                if(c==' ')i++;
                else{
                    end = endIndex(charArray, i);
                    reverse(charArray, i, end);
                    i = end+1;
                }
            }
            return String.valueOf(charArray);
        }

        public static void reverse(char[] charArray, int s, int e){
            char temp;
            int j = e-1;
            while(s<j){
                temp = charArray[s];
                charArray[s] = charArray[j];
                charArray[j] = temp;
                s++;
                j--;
            }
        }

        public int endIndex(char[] charArray, int start){
            // System.out.println("start : "+start);
            int i = start;
            while(i< charArray.length && charArray[i]!=' '){i++;}
            return i;
        }
    }
