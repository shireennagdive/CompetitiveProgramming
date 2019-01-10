import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
        String[] values;
        List<String> res;
        int finalLen;
        public List<String> letterCombinations(String digits) {
            res = new ArrayList<>();
            if(digits.equals("")) return res;
            finalLen = digits.length();
            values = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            dfs(new StringBuilder(""), digits, 0);
            return res;
        }

        public void dfs(StringBuilder sb, String digits, int pos){
            if(sb.length()==finalLen){
                res.add(sb.toString());
                return;
            }

            if(pos>finalLen) return;

            for(int i=0;i<values[digits.charAt(pos)-'0'].length();i++){
                int len = sb.length();
                sb.append(values[digits.charAt(pos)-'0'].charAt(i));
                dfs(sb,digits, pos+1);
                sb.setLength(len);
        }
    }
}
