import java.util.*;

public class RemoveParenthesis {
        public List<String> removeInvalidParentheses(String s) {
            List<String> result = new ArrayList<>();
            Set<String> res = new HashSet<>();
            int rmL=0,rmR=0;
            for(char c : s.toCharArray()){
                if(c=='('){
                    rmL++;
                }else if(c==')'){
                    if(rmL!=0) rmL--;
                    else rmR++;
                }
            }

            StringBuilder sb = new StringBuilder();
            dfs(s,0,sb,rmL,rmR,0,res);

            Iterator<String> it = res.iterator();
            while(it.hasNext()){
                result.add(it.next());
            }
            return result;
        }

        public void dfs(String s, int i, StringBuilder sb, int rmL, int rmR, int open, Set<String> res){
            if(rmL<0 || rmR<0 || open<0) return;
            if(i==s.length()){
                if(rmL==0 && rmR==0 && open==0){
                    res.add(sb.toString());
                }
                return;
            }
            char c = s.charAt(i);
            int len = sb.length();
            if(c=='('){
                dfs(s,i+1,sb,rmL-1,rmR,open,res); //do not use
                dfs(s,i+1,sb.append(c), rmL,rmR,open+1,res); //use (
            }else if(c==')'){
                dfs(s,i+1,sb,rmL,rmR-1,open,res); //do not use
                dfs(s,i+1,sb.append(c), rmL,rmR,open-1,res); //use (
            }else{
                dfs(s,i+1,sb.append(c), rmL,rmR,open,res);
            }
            sb.setLength(len);
        }
    }
