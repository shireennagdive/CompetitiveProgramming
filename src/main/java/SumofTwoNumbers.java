public class SumofTwoNumbers {
     static int add(int x, int y)
        {
            int carry;
            while(y!=0)
            {
                carry = x & y;
                x = x ^ y;
                y = carry << 1;
            }
            return x;
        }
        public static void main(String args[])
        {
            int x = -1;
            int y = 1;
            System.out.println("The Summation is: "+add(x, y));
        }

}