public class MostProfitAssigning {
        public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
            int sum=0;
            int max = Integer.MIN_VALUE;

            for(int v : difficulty){
                if(v > max){
                    max=v;
                }
            }
            System.out.println(max+" : max");

            int[] maxProfit = new int[max+1];

            for(int i=0;i<difficulty.length;i++){
                maxProfit[difficulty[i]] = Math.max(maxProfit[difficulty[i]],profit[i]);
            }

            for(int i=1;i<max+1;i++){
                maxProfit[i] = Math.max(maxProfit[i-1],maxProfit[i]);
            }

            for(int i=0;i<worker.length;i++){
                if(worker[i]<=max){
                    sum+=maxProfit[worker[i]];
                }else{
                    sum+=maxProfit[max];
                    //System.out.println(maxProfit[max]+" : greater than max");
                }
            }

            return sum;
    }

    /*
    * TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            tmap.put(difficulty[i], Math.max(profit[i], tmap.getOrDefault(difficulty[i], 0)));
        }

        int max = 0, res = 0;
        for (Integer key : tmap.keySet()) {
            max = Math.max(tmap.get(key), max);
            tmap.put(key, max);
        }

        Map.Entry<Integer, Integer> entry = null;
        for (int i = 0; i < worker.length; i++) {
            entry = tmap.floorEntry(worker[i]);
            if (entry != null) {
                res += entry.getValue();
            }
        }
        return res;  */
}
