public class AddBinary {
        public String addBinary(String a, String b) {
            int carry=0,x,y,sum;
            StringBuilder sb = new StringBuilder();
            for(int i=a.length()-1,j=b.length()-1;i>=0 || j>=0;i--,j--){
                x = (i>=0) ? a.charAt(i)-'0' : 0;
                y = (j>=0) ? b.charAt(j)-'0' : 0;
                sum = x+y+carry;
                carry = (sum)/2;
                sb.insert(0,sum%2);
            }
            if(carry==1)  sb.insert(0,1);
            return sb.toString();
        }
}
