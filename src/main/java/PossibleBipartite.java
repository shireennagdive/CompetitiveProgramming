import java.util.ArrayList;
import java.util.List;

public class PossibleBipartite {
        List<Integer>[] adj;
        int[] color;
        public boolean possibleBipartition(int N, int[][] dislikes) {
            if(dislikes.length==0 || dislikes[0].length==0) return true;
            color = new int[N+1];

            adj = new List[N+1];
            for(int i=1;i<N+1;i++){
                adj[i] = new ArrayList<>();
            }
            for(int[] p : dislikes){
                adj[p[0]].add(p[1]);
                adj[p[1]].add(p[0]);
            }


            for(int i=1;i<N+1;i++){
                if(color[i]==0){
                    color[i]=1;
                    if(!dfs(i)) return false;
                }
            }
            return true;
        }

        public boolean dfs(int person){

            for(int d : adj[person]){
                if(color[d]==-1*color[person]) continue;

                if(color[d]==color[person]) return false;
                color[d] = -1*color[person];
                if(!dfs(d)) return false;
            }

            return true;
        }
    }
