import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            if(nums1.length==0 || nums2.length==0) return new int[0];
            int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
            for(int i = 0;i<nums1.length;i++){
                if(max<nums1[i]){
                    max = nums1[i];
                }
                if(min>nums1[i]){
                    min = nums1[i];
                }
            }
            boolean[] temp = new boolean[max-min+1];
            for(int i = 0;i<nums1.length;i++){
                temp[nums1[i]-min] = true;
            }
            List<Integer> res = new ArrayList<>();
            for(int i =0;i<nums2.length;i++){
                if(nums2[i]<=max && nums2[i]>= min && temp[nums2[i]-min]){
                    temp[nums2[i]-min] = false;
                    res.add(nums2[i]);
                }
            }
            int[] result = new int[res.size()];
            for(int i = 0; i < res.size(); i++) result[i] = res.get(i);
            return result;

        }


    }
}
