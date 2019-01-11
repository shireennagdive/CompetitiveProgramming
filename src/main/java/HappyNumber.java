import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
        public boolean isHappy(int n) {
            if(n<=0) return false;
            Set<Integer> set = new HashSet<>();
            int sum=n,temp;

            while(sum!=1){
                sum=0;
                while(n!=0){
                    temp=n%10;
                    sum+=temp*temp;
                    n=n/10;
                }
                if(!set.contains(sum)){
                    set.add(sum);
                }else{
                    return false;
                }
                n=sum;
            }
            return true;
        }
}
