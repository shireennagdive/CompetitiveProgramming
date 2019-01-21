public class SingleNumberIII {
        public int[] singleNumber(int[] nums) {
            int[] ans = new int[2];
            int res=0;
            for(int num : nums){
                res^=num;
            }
            res = res & -res;
            for(int num : nums){
                if((num & res) == 0){
                    ans[0]^=num;
                }else{
                    ans[1]^=num;
                }
            }
            return ans;
        }
}
