import java.util.ArrayList;
import java.util.List;

public class IPtoCIDR {
        List<String> res;
        public List<String> ipToCIDR(String ip, int n) {
            res = new ArrayList<>();
            long step;
            long x=0;
            String[] ipVal = ip.split("\\.");
            for(String w : ipVal){
                x = x*256 + Integer.parseInt(w);
            }

            while(n>0){
                step = x & (-x);
                while(step>n){step/=2;}
                res.add(longToIP(x,(int)step));
                x+=step;
                n-=step;
            }
            return res;
        }

        public String longToIP(long x, int step){

            int[] result = new int[5];
            result[0] = (int)(x & 255);
            x>>=8;

            result[1] = (int)(x & 255);
            x>>=8;

            result[2] = (int)(x & 255);
            x>>=8;

            result[3] = (int)(x & 255);

            int len=33;
            while(step>0){
                len--;
                step/=2;
            }
            return result[3]+"."+result[2]+"."+result[1]+"."+result[0]+"/"+len;
        }
}
