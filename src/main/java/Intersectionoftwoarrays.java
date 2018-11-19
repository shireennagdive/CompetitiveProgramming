import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersectionoftwoarrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[0];
        if(nums1.length==0 || nums2.length==0){return new int[]{};}
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j])i++;
            else j++;
        }
        result = new int[res.size()];
        for(i=0;i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
