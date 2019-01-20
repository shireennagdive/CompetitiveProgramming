import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StroboNumberII {

        Map<Character,Character> map;
        List<String> res;
        public List<String> findStrobogrammatic(int n) {

            res = new ArrayList<>();
            if(n==0) return res;
            if(n==1) {
                res.add("0");
                res.add("1");
                res.add("8");
                return res;
            }
            map = new HashMap<>();
            map.put('0','0');
            map.put('1','1');
            map.put('8','8');
            map.put('6','9');
            map.put('9','6');
            char[] arr = new char[n];
            dfs(0,n,arr);
            return res;
        }


        public void dfs(int index, int n, char[] arr){
            if(index == (n+1)/2){
                res.add(String.valueOf(arr));
                return;
            }

            for(char c : map.keySet()){
                if(index==0 && c=='0' && n>1) continue;
                if(index==n/2 && (c=='6' || c=='9')) continue;
                arr[index] = c;
                arr[n-index-1] = map.get(c);
                dfs(index+1,n,arr);
            }

        }
}
