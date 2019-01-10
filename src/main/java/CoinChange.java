public class CoinChange {
        int val;
        public int coinChange(int[] coins, int amount) {
            if(amount==0) return 0;
            int[] sums = new int[amount+1];
            sums[0]=0;
            for(int i=0;i<sums.length;i++){
                sums[i]=amount+1;
            }

            for(int i=0;i<coins.length;i++){
                if(coins[i]<sums.length) sums[coins[i]]=1;
            }

            for(int j=1;j<sums.length;j++){
                for(int i=0;i<coins.length;i++){
                    if(j-coins[i]>=0) {
                        sums[j]  = Math.min(sums[j], sums[j-coins[i]] + 1);
                    }
                }
            }
            return (sums[amount]==amount+1) ? -1 : sums[amount];
        }
}
