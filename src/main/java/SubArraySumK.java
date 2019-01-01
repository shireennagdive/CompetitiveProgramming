import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
        public int subarraySum(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            int sum=0,count=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(map.containsKey(sum-k)){
                    //  System.out.println("end index : "+i);
                    count+=map.get(sum-k);
                    //   System.out.println("count at i : "+count);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            return count;
        }
    }
