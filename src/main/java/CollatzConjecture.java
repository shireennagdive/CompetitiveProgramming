import java.math.BigInteger;

public class CollatzConjecture {
//        static Map<Integer, Integer> map = new HashMap<>();
//
//        private static int findSteps(int num) {
//            if (num <= 1) return 1;
//            if (map.containsKey(num)) return map.get(num);
//            if (num % 2 == 0) num = num / 2;
//            else num = 3 * num + 1;
//            if (map.containsKey(num)) return map.get(num) + 1;
//            int t = findSteps(num);
//            map.put(num, t);
//            return t + 1;
//        }
//
//        public static int findLongestSteps(int num) {
//            if (num < 1) return 0;
//
//            int res = 0;
//            for (int i = 1; i <= num; i++) {
//                int t = findSteps(i);
//                map.put(i, t);
//                res = Math.max(res, t);
//            }
//
//            return res;
//        }

        public static void main(String[] args){
            //3, 10, 5, 16, 8, 4, 2, 1
           // System.out.println(findLongestSteps(63728127));
            Long raj = 27L;
            int k=0;

            BigInteger n = BigInteger.valueOf(raj);

            while(n.compareTo(BigInteger.ONE) > 0){
                if(n.testBit(0)){
                    n = n.multiply(BigInteger.valueOf(3));
                    n = n.add(BigInteger.ONE);
                    System.out.println(n);
                    k++;
                }
                else {
                    n = n.divide(BigInteger.valueOf(2));
                    System.out.println(n);
                    k++;
                }
            }
            System.out.print("It took " + k + " iterations!");
        }
}


