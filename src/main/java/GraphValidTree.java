import java.util.ArrayList;
import java.util.List;

public class GraphValidTree {
        List<Integer>[] adj;
        boolean[] visited;
        public boolean validTree(int n, int[][] edges) {
            visited = new boolean[n];
            adj = new List[n];
            int node1,node2;
            for(int i=0;i<n;i++){
                adj[i] = new ArrayList<>();
            }

            for(int i=0;i<edges.length;i++){
                adj[edges[i][0]].add(edges[i][1]);
                adj[edges[i][1]].add(edges[i][0]);
            }

            if(!dfs(0,-1)) return false;

            for(int i=0;i<n;i++){
                if(visited[i]==false) return false;
            }

            return true;
        }

        public boolean dfs(int node, int parent){
            visited[node]  = true;
            for(int i : adj[node]){
                if(i==parent) continue;
                if(visited[i] || !dfs(i, node)){
                    return false;
                }
            }
            return true;
        }
    }
