public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) count[c - 'a'] += 1;
        for (char c : t.toCharArray()) count[c - 'a'] -= 1;
        for (int i : count) if (i != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "a";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s1, s2));
    }
}
