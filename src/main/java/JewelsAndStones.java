public class JewelsAndStones {

        public int numJewelsInStones(String J, String S) {
            int count=0;
            int[] map = new int[128];
            for(char c : J.toCharArray()){
                map[c]=1;
            }
            for(char c : S.toCharArray()){
                if(map[c]>0){
                    count++;
                }
            }

            return count;
        }
}
