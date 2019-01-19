import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfComponentsInConnectedGraph {
    class Solution {
        int count;
        Set<Integer> visited;
        List<Integer>[] adj;
        public int countComponents(int n, int[][] edges) {
            if(edges==null) return 0;

            count=0;

            visited = new HashSet<>();
            adj = new List[n];
            for(int i=0;i<n;i++){
                adj[i] = new ArrayList<>();
            }

            for(int i=0;i<edges.length;i++){
                int node1 = edges[i][0];
                int node2 = edges[i][1];
                adj[node1].add(node2);
                adj[node2].add(node1);
            }

            for(int i=0;i<n;i++){
                if(!visited.contains(i)){
                    visited.add(i);
                    dfs(i);
                    count++;
                }
            }

            return count;
        }

        public void dfs(int node){
            if(!adj[node].isEmpty()){
                for(int child : adj[node]){
                    if(!visited.contains(child)){
                        visited.add(child);
                        dfs(child);
                    }
                }
            }
        }
    }
}
