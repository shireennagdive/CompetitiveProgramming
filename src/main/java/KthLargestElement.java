import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
        public int findKthLargest(int[] nums, int k) {
            int res;
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>(){
                // @Override
                public int compare(Integer a, Integer b){
                    return b-a;
                }});

            for(int i=0;i<nums.length;i++){
                pq.add(nums[i]);
            }
            while(k!=1){
                pq.poll();
                k--;
            }
            return pq.poll();

        }
    }
}
