public class BiPartititeGrap {
        int[] colors;
        public boolean isBipartite(int[][] graph) {
            colors  = new int[graph.length];
            for(int i=0;i<graph.length;i++){
                if(colors[i]==0){
                    colors[i]=-1;
                    if(!dfs(graph,i)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean dfs(int[][] graph, int parent){
            for(int val : graph[parent]){
                if(Math.abs(colors[parent]+colors[val]) == 2) return false;
                if(colors[val]==0){
                    colors[val] = -1*colors[parent];
                    if(!dfs(graph, val)) return false;
                }
            }
            return true;
    }
}
