public class StringCompression {
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        char[] chars = new char[]{'a', 'b', 'c'};
        System.out.println(stringCompression.compress(chars));
    }

    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        int count[] = new int[chars.length], res = 0;
        char prevChar = chars[0];
        count[0] = 1;
        for (int j = 1, i = 0; j < chars.length; j++) {
            if (chars[j] == prevChar) {
                count[i]++;
            } else {
                i++;
                count[i] = 1;
            }
            prevChar = chars[j];
        }
        for (int aCount : count) {
            if (aCount > 1 && aCount <= 9) {
                res += 1;
            } else if (aCount >= 10 && aCount <= 99) {
                res += 2;
            } else if (aCount >= 100 && aCount <= 999) {
                res += 3;
            } else if (aCount == 1000) {
                res += 4;
            }
            res++;
        }
        return res;
    }
}
