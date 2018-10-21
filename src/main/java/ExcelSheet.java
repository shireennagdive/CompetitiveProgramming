public class ExcelSheet {

        public String convertToTitle(int n) {
            StringBuilder res = new StringBuilder();
            while (n != 0) {
                res.append(((n - 1) % 26) +'A');
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
