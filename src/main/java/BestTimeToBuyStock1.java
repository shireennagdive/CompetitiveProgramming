public class BestTimeToBuyStock1 {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int max=0,minIndex=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] - prices[minIndex] > max){
                max = prices[i] - prices[minIndex];
            }
            else if(prices[i] < prices[minIndex]){
                minIndex = i;
            }
        }
        return max;
    }
}
