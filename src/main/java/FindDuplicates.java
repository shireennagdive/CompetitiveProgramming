import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> res = new ArrayList<>();
            int value=0;
            for(int i=0;i<nums.length;i++){
                value=Math.abs(nums[i])-1;
                if(nums[value]<0){
                    res.add(value+1);
                }else{
                    nums[value] = nums[value]*-1;
                }
            }
            return res;
        }

}
