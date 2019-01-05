import java.util.Arrays;

public class TaskScheduler {
        public int leastInterval(char[] tasks, int n) {
            int[] freq = new int[26];
            for(char c : tasks){
                freq[c-'A']++;
            }
            int i=0,cnt=0;
            Arrays.sort(freq);
            while(freq[25]>0){
                i=0;
                while(i<=n){
                    if(freq[25]==0){
                        break;
                    }
                    if(i<26 && freq[25-i] > 0){
                        freq[25-i]-=1;
                    }
                    i++;
                    cnt++;
                }
                Arrays.sort(freq);
            }
            return cnt;
        }
}
