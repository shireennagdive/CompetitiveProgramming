import java.util.Arrays;

public class MeetingRooms2 {
        public int minMeetingRooms(Interval[] intervals) {
            int len = intervals.length;
            if(len == 0) return 0;
            int[] starts = new int[len];
            int[] ends = new int[len];
            for(int i=0;i<len;i++) {
                starts[i] = intervals[i].start;
                ends[i] = intervals[i].end;
            }
            Arrays.sort(starts);
            Arrays.sort(ends);
            int count=1,min=ends[0];
            int minEndTime = 0;
            for(int i=1;i<len;i++){
                if(starts[i] < min){count++;}
                else{minEndTime++;min = ends[minEndTime];}
            }
            return count;
        }
}
