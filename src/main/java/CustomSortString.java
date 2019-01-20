public class CustomSortString {

    // //* Definition for a binary tree node.
    //  public class TreeNode {
    //      int val;
    //      TreeNode left;
    //      TreeNode right;
    //      TreeNode(int x) { val = x; }
    //  }



        public String customSortString(String S, String T) {

            char[] count = new char[26];
            StringBuilder sb = new StringBuilder();

            for(char c : T.toCharArray()){
                count[c-'a']++;
            }

            for(char c : S.toCharArray()){
                while(count[c-'a']>0){
                    sb.append(c);
                    count[c-'a']--;
                }
            }

            for(char c : T.toCharArray()){
                while(count[c-'a']>0){
                    sb.append(c);
                    count[c-'a']--;
                }
            }

            return sb.toString();


        }

}
