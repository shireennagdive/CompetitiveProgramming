public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber number = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(number.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int length = nums.length;
        int expected_sum = (length * (length + 1)) / 2;
        int actual_sum = 0;
        for (int i : nums) {
            actual_sum += i;
        }
        return expected_sum-actual_sum;
    }

}
