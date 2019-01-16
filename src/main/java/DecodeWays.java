public class DecodeWays {
        public int numDecodings(String s) {
            if(s==null || s.length()==0) return 0;
            int n = s.length();
            int[] dp = new int[n+1];

            dp[0]=1;
            dp[1] =  s.charAt(0)-'0'== 0 ? 0 : 1;

            int oneDig, twoDig;
            for(int i=2;i<=n;i++){
                oneDig = Integer.valueOf(s.substring(i-1,i));
                twoDig = Integer.valueOf(s.substring(i-2,i));
                if(oneDig>0 && oneDig<10){
                    dp[i]+=dp[i-1];
                }
                if(twoDig>=10 && twoDig<=26){
                    dp[i]+=dp[i-2];
                }
            }
            return dp[n];
        }
}
