public class IsSubsequence {
        public boolean isSubsequence(String s, String t) {
            if(s.length() > t.length()) return false;
            if(s.equals("")) return true;

            int i=0;
            int n = s.length();
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                    if(i==n) return true;

                }
            }

            return false;
        }
}
