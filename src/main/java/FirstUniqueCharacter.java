public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] count = new int[27];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            if(count[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter fq = new FirstUniqueCharacter();
        System.out.println(fq.firstUniqChar("shireens"));
    }
}
