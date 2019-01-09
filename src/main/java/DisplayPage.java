import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DisplayPage {
        public static List<String> displayPages(List<String> input, int pageSize) {
            List<String> res = new ArrayList<>();
            if (input == null || input.size() == 0) {
                return res;
            }

            List<String> visited;
            visited = new ArrayList<>();
            Iterator<String> iter = input.iterator();
          boolean reachEnd = false;
            while (iter.hasNext()) {
                String curr = iter.next();
                String hostId = curr.split(",")[0];
                if (!visited.contains(hostId) || reachEnd) {
                    res.add(curr);
                    visited.add(hostId);
                    iter.remove();
                }

                if (visited.size() == pageSize) {
                    visited.clear();
                   reachEnd = false;
                    if (!input.isEmpty()) {
                        res.add(" ");
                    }
                    iter = input.iterator();
                }

                if (!iter.hasNext()) {
                    iter = input.iterator();
                    reachEnd = true;
                }
            }

            return res;
        }

    public static void main(String[] args) {
        String[] strs = new String[]{
                "1,28,300.1,SanFrancisco",
                "4,5,209.1,SanFrancisco",
                "20,7,208.1,SanFrancisco",
                "23,8,207.1,SanFrancisco",
                "16,10,206.1,Oakland",
                "1,16,205.1,SanFrancisco",
                "6,29,204.1,SanFrancisco",
                "7,20,203.1,SanFrancisco",
                "8,21,202.1,SanFrancisco",
                "2,18,201.1,SanFrancisco",
                "2,30,200.1,SanFrancisco"

        };

        List<String> input = new ArrayList<>();

        for(String s : strs){
            input.add(s);
        }


        List<String> res = displayPages(input,12);
        for(String s : res){
            System.out.println(s);
        }

    }

}



