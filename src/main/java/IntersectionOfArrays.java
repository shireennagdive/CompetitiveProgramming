import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if(nums1.length==0 || nums2.length==0) return new int[0];
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            int k=0;
            int[] result = new int[nums1.length];
            for(int i=0;i<nums1.length;i++){
                set1.add(nums1[i]);
            }
            for(int j=0;j<nums2.length;j++){
                set2.add(nums2[j]);
            }
            Iterator<Integer> it = set1.iterator();
            while(it.hasNext()){
                int temp = it.next();
                if(set2.contains(temp)){
                    result[k++] = temp;
                }
            }
            return Arrays.copyOfRange(result,0,k);
        }


    }
}
