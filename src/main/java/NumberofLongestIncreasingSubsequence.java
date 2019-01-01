public class NumberofLongestIncreasingSubsequence {
        public int findNumberOfLIS(int[] nums) {
            if(nums==null || nums.length==0) return 0;
            if(nums.length==1) return 1;
            int max=1,res=0;
            int[] len = new int[nums.length];
            int[] cnt = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                len[i]=cnt[i] = 1;
                for(int j=0;j<i;j++){
                    if(nums[i]  > nums[j]){
                        if(len[j]+1 > len[i]){
                            len[i] = len[j]+1;
                            cnt[i]=cnt[j];
                        }else if(len[i]==len[j]+1){
                            cnt[i]+=cnt[j];
                        }
                    }
                }
                max = Math.max(max,len[i]);
            }
            for(int i=0;i<nums.length;i++){
                if(max==len[i]) res+=cnt[i];
            }
            return res;
        }
}
