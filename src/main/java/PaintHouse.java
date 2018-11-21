public class PaintHouse {
    public int minCost(int[][] costs) {
        if(costs.length==0) return 0;
        int[] best = new int[]{costs[0][0],
                costs[0][1],costs[0]
                [2]};
        int red,blue,green;
        for(int i=1;i<costs.length;i++){
            red = costs[i][0] + Math.min(best[1] , best[2]);
            blue = costs[i][1] + Math.min(best[0] , best[2]);
            green = costs[i][2] + Math.min(best[0] , best[1]);
            best[0] = red;best[1] = blue;best[2]=green;
        }
        return Math.min(best[0],Math.min(best[1],best[2]));
    }
}
