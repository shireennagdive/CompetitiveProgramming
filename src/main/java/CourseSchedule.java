import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adjacencyList = new List[numCourses];
        int[] indegree = new int[numCourses];
        int preCourse, currCourse, count=0,edges=0;
        for(int i=0;i<numCourses;i++){
            adjacencyList[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<prerequisites.length;i++){
            preCourse = prerequisites[i][1];
            currCourse = prerequisites[i][0];
            adjacencyList[preCourse].add(currCourse);
            indegree[currCourse]++;
        }

        Queue<Integer> subjectTopoList = new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                subjectTopoList.offer(i);
            }
        }

        while(!subjectTopoList.isEmpty()){
            currCourse = subjectTopoList.poll();
            edges++;
            for(int nextCourse : adjacencyList[currCourse]){
                indegree[nextCourse]--;
                if(indegree[nextCourse] == 0){
                    subjectTopoList.offer(nextCourse);
                }
            }
        }
        return edges == numCourses;
    }
}
