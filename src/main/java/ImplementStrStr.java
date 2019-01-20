class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            for (j = 0; j < needle.length(); j++) {
                if (i + j == haystack.length()) return -1;

                if (haystack.charAt(i + j) != needle.charAt(j)) break;

            }
            if (j == needle.length()) return i;
        }
        return -1;

    }


    public static void main(String args[]) {
        ImplementStrStr sol = new ImplementStrStr();
        System.out.println(sol.strStr("shireenmilind", "reen"));


    }
}