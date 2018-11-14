public class KeyBoardRow {
    public String[] findWords(String[] words) {
        int[] row1 = new int[26];
        int[] row2 = new int[26];
        int[] row3 = new int[26];
        List<String> res = new ArrayList<>();
        int i=0,flag=0,j=0;
        for(char c : "QWERTYUIOP".toCharArray())row1[c-'A']=1;

        for(char c : "ASDFGHJKL".toCharArray())row2[c-'A']=1;

        for(char c : "ZXCVBNM".toCharArray())row3[c-'A']=1;

        for(String input : words){
            String upperStr = input.toUpperCase();
            char[] arr = upperStr.toCharArray();
            int n = input.length();

            i=0;
            while(i<n && row1[arr[i]-'A']==1)i++;
            if(i==n) res.add(input);
            else if(i>0)continue;
            else if(i==0){
                while(i<n && row2[arr[i]-'A']==1)i++;
                if(i==n) res.add(input);
                else if(i>0)continue;
                else if(i==0){
                    while(i<n && row3[arr[i]-'A']==1) i++;
                    if(i==n) res.add(input);
                }
            }
        }
        String[] s = new String[res.size()];
        return res.toArray(s);
    }
}
