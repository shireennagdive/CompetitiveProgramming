public class PalindromePermut {
    public boolean canPermutePalindrome(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[126];
        int flag = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            count[arr[i] - '!']++;
        }
        for (int i = 0; i < 126 && flag < 2; i++) {
            if (count[i] == 1) flag++;
            else if (count[i] % 2 != 0) flag++;
        }
        return flag < 2;
    }
}
