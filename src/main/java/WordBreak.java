import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Wordbreak {
    Set<String> dict;
    public boolean wordBreak(String s, List<String> wordDict) {
        dict = new HashSet<>(wordDict);
        return checkWord(s);
    }

    public boolean checkWord(String s){
        boolean dp[] = new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }

        return dp[s.length()];
    }

}