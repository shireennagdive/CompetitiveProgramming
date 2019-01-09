import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeFreeTime {
    /**
     * Definition for an interval.
     * public class Interval {
     *     int start;
     *     int end;
     *     Interval() { start = 0; end = 0; }
     *     Interval(int s, int e) { start = s; end = e; }
     * }
     */
        public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
            List<Interval> res = new ArrayList<>();
            List<Integer> start = new ArrayList<>();
            List<Integer> end = new ArrayList<>();

            for(List<Interval> list : schedule){

                for(Interval i : list){
                    start.add(i.start);
                    end.add(i.end);
                }
            }

            Collections.sort(start);
            Collections.sort(end);
            for(int i=1,j=0;i<start.size();i++,j++){
                if(start.get(i) > end.get(j)){
                    res.add(new Interval(end.get(j), start.get(i)));
                }
            }
            return res;

    }
}
