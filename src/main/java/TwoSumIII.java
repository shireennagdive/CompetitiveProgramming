import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {
    class TwoSum {

        /** Initialize your data structure here. */
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int min,max;
        public TwoSum(){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }

        /** Add the number to an internal data structure.. */
        public void add(int number) {

            min = Math.min(min,number);
            max = Math.max(max,number);
            map.put(number,map.getOrDefault(number,0) + 1);
        }

        /** Find if there exists any pair of numbers which sum is equal to the value. */
        public boolean find(int value) {
            if(value<2*min || value>2*max) return false;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(map.containsKey(value-entry.getKey())){
                    if(entry.getKey() == value - entry.getKey()){
                        if(entry.getValue() >= 2) return true;
                    }else{
                        return true;
                    }
                }

            }
            return false;
        }
    }

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
}
