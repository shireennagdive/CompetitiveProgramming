public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int[] sum = new int[digits.length+1];

        for(int i=digits.length-1; i>=0; i--){
            sum[i+1] = (digits[i]+carry) % 10;
            carry = (digits[i]+carry)/10;
        }

        if(carry==1){
            sum[0]=1;
            return sum;
        }else{
            for(int i=sum.length-1;i>=1;i--){
                digits[i-1]=sum[i];
            }
            return digits;
        }
    }
}
