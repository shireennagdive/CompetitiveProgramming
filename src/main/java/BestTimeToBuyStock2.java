public class BestTimeToBuyStock2 {
        public int maxProfit(int[] prices) {
            if(prices.length==0) return 0;
            int max=0,curr=0;
            for(int i=1;i<prices.length;i++){
                if(prices[i-1] < prices[i]){
                    max+=prices[i] - prices[i-1];
                }
            }
            return max;
        }
    }

