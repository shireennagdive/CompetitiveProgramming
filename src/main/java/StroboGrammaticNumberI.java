import java.util.HashMap;
import java.util.Map;

class StroboGrammaticNumberI {
    public boolean isStrobogrammatic(String num) {

        if(num.equals("")) return true;
        Map<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');


        int i=0,j=num.length()-1;
        char a,b;
        while(i<=j){
            a=num.charAt(i);
            b=num.charAt(j);
            if(!map.containsKey(a) || !map.containsKey(b))  return false;
            if(map.get(b)!=a) return false;
            i++;
            j--;

        }


        return true;

    }
}