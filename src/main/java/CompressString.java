public class CompressString {
    //Complexity - Length of the string
        public int compress(char[] chars) {
            if(chars==null || chars.length==0) return -1;
            if(chars.length==1) return 1;
            int count=1,j=1;
            for(int i=1;i<chars.length;i++){
                if(chars[i-1]==chars[i]){
                    count++;
                }else{
                    if(count!=1){

                        String c = String.valueOf(count);
                        if(c.length()>1){
                            for(char temp : c.toCharArray()){
                                chars[j++] = temp;
                            }
                        }else  {

                            chars[j++]=c.charAt(0);

                        }

                    }
                    count=1;
                    chars[j] = chars[i];
                    j++;

                }
            }

            if(count!=1) {
                String c = String.valueOf(count);
                if(c.length()>1){
                    for(char temp : c.toCharArray()){
                        chars[j++] = temp;
                    }
                }else  chars[j++]=c.charAt(0);
            }

            return j;
        }
    }
