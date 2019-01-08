public class MinimumWindowSubstring {
        public String minWindow(String s, String t) {
            int count = t.length();
            int start=0, end=0,s1=0,len=Integer.MAX_VALUE;
            int[] map = new int[128];
            for(char c : t.toCharArray()){
                map[c]++;
            }

            while(end<s.length()){
                if(map[s.charAt(end)] > 0) count--;
                map[s.charAt(end)]--;
                end++;

                while(count==0){
                    if(end-start < len){
                        len = end-start;
                        s1 = start;
                    }
                    if(map[s.charAt(start)]==0) count++;
                    map[s.charAt(start)]++;
                    start++;
                }

            }

            return len==Integer.MAX_VALUE ? "" : s.substring(s1,s1+len);

        }
}
