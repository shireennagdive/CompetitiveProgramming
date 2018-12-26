public class MinimumAddToMakeBalance {
        public int minAddToMakeValid(String S) {
            int count1=0,count=0;
            for(char c : S.toCharArray()){
                if(c=='('){
                    count1++;
                }else{
                    if(count1>0){
                        count1--;
                    }else if(count1==0) count++;
                }
            }

            return count+count1;
        }
    }
