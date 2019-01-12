import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] res = new int[numCourses];
            List<Integer>[] adj = new List[numCourses];
            int nodesVisited=0,pre,curr;
            int[] indegree = new int[numCourses];
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0;i<prerequisites.length;i++){
                pre = prerequisites[i][1];
                curr = prerequisites[i][0];
                if(adj[pre]==null) adj[pre] = new ArrayList<>();
                adj[pre].add(curr);
                indegree[curr]++;
            }
            for(int i=0;i<numCourses;i++){
                if(indegree[i]==0) queue.offer(i);
            }

            while(!queue.isEmpty()){
                curr = queue.poll();
                res[nodesVisited] = curr;
                nodesVisited++;
                if(adj[curr]!=null){
                    for(int v : adj[curr]){
                        indegree[v]--;
                        if(indegree[v]==0){
                            queue.offer(v);
                        }
                    }
                }
            }
            if(nodesVisited!=numCourses) return new int[]{};
            return res;
        }
}
