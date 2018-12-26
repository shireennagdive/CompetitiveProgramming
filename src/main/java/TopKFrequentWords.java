import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {
    public static void main(String[] args) {
        System.out.println(getTopK(new int[]{1,1,1,2,2,3} , 2));
    }

//    public static List<Integer> getTopK(int[] nums, int k){
//        List<Integer> res = new ArrayList<>();
//        if(nums==null || nums.length==0) return res;
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int val : nums){
//            map.put(val,map.getOrDefault(val,0)+1);
//        }
//        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
//            public int compare(Integer a, Integer b){
//                return map.get(b)-map.get(a);
//            }
//        });
//
//        for(int key : map.keySet()){
//            queue.add(key);
//        }
//
//        while(k!=0){
//            res.add(queue.poll());
//            k--;
//        }
//        return res;
//
//    }
    public static List<Integer> getTopK(int[] nums, int k) {
    List<Integer> res = new ArrayList<>();
    if(nums==null || nums.length==0) return res;
    Map<Integer,Integer> map = new HashMap<>();

    for(int val : nums){
        map.put(val,map.getOrDefault(val,0)+1);
    }

    List<Integer>[] buckets = new List[nums.length+1];

    for(int key : map.keySet()){
        if(buckets[map.get(key)]==null){
            buckets[map.get(key)] = new ArrayList<>();
        }
        buckets[map.get(key)].add(key);
    }
    for(int i=nums.length;res.size() < k && i>=0;i--){
        if(buckets[i]!=null){
            res.addAll(buckets[i]);
        }
    }

    return res;

}


}
