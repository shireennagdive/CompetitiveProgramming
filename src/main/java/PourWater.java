public class PourWater {
        public int[] pourWater(int[] heights, int V, int K) {
            int pos;
            while(V>0){
                pos = getLeftMinimum(K,heights);
                if(pos!=K){
                    heights[pos]++;
                    V--;
                }else{
                    pos=getRighttMinimum(K,heights);
                    if(pos!=K){
                        heights[pos]++;
                        V--;
                    }else{
                        heights[K]++;
                        V--;
                    }
                }
            }
            return heights;
        }
        public int getLeftMinimum(int pos,int[] heights){
            for(int i=pos-1;i>=0;i--){
                if(heights[i] > heights[pos]){
                    break;
                }else if(heights[i] < heights[pos]){
                    pos=i;
                }
            }
            return pos;
        }
        public int getRighttMinimum(int pos,int[] heights){
            for(int i=pos+1;i<heights.length;i++){
                if(heights[i] > heights[pos]){
                    break;
                }else if(heights[i] < heights[pos]){
                    pos=i;
                }
            }
            return pos;
        }
    }
