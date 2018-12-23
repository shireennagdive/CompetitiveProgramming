public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int low=0,high=s.length()-1;

        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) break;
            low++;high--;
        }

        if(low>=high) return true;
        return checkPalinSubstring(s,low+1,high) || checkPalinSubstring(s,low,high-1);
    }

    public static boolean checkPalinSubstring(String s, int low, int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) break;
            low++;high--;
        }
        return low>=high;
    }
}


/*
*
* */