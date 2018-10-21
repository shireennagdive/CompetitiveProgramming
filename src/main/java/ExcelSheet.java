public class ExcelSheet {

        public String convertToTitle(int n) {
            StringBuilder res = new StringBuilder();
            String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H",
                    "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            while (n != 0) {
                res.append(alphabets[(n - 1) % 26]);
                n = ((n - 1) / 26);
            }
            return res.reverse().toString();
        }

        public int titleToNumber(String s) {
            int res=0,k=1,count=2;
            for(int i=s.length()-1;i>=0;i--){
                res+=k*(s.charAt(i)-'A' + 1);
                k*=26;
            }
            return res;
        }

}
