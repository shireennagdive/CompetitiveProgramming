import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    /**
     * Definition for an interval.
     * public class Interval {
     *     int start;
     *     int end;
     *     Interval() { start = 0; end = 0; }
     *     Interval(int s, int e) { start = s; end = e; }
     * }
     */
        public List<Interval> merge(List<Interval> intervals) {

            List<Interval> result = new ArrayList<>();
            if(intervals.size()==0) return result;
            int[] start = new int[intervals.size()];
            int[] end = new int[intervals.size()];
            for(int i=0;i<intervals.size();i++){
                start[i] = intervals.get(i).start;
                end[i] = intervals.get(i).end;
            }
            Arrays.sort(start);
            Arrays.sort(end);
            int j=0,s=start[0],e;
            for(int i=1;i<start.length;i++){
                if(start[i]>end[j]){
                    e = end[j];
                    result.add(new Interval(s,e));
                    s=start[i];
                }
                j++;
            }
            result.add(new Interval(s,end[j]));
            return result;
        }
    }
