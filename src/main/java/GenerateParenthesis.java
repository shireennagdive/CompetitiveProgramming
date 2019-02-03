import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
        List<String> res;

        public List<String> generateParenthesis(int n) {
            res =  new ArrayList<>();
            dfs(n,n,new StringBuilder());
            return res;
        }

        public void dfs(int left, int right, StringBuilder sb){
            if(left<0){
                return;
            }

            if(left==0 && right==0){
                res.add(sb.toString());
                return;
            }

            if(left>0){
                dfs(left-1, right, sb.append("("));
                sb.deleteCharAt(sb.length()-1);
            }

            if(left < right){
                dfs(left, right-1, sb.append(")"));
                sb.deleteCharAt(sb.length()-1);
            }
        }

}
