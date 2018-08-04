package main.java;

public class MaximumSubArray {


    public static void main(String[] args) {
        int input[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(input));
    }

    public static int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] sum = new int[length];
        for (int i = 0; i < length; i++) {
            sum[i] = nums[i];
        }
        int maxSum = sum[0];
        for (int i = 0; i < length - 1; i++) {
            if (sum[i] + nums[i + 1] > sum[i + 1]) {
                sum[i + 1] = sum[i] + nums[i + 1];
            }
            if (sum[i + 1] > maxSum) {
                maxSum = sum[i + 1];
            }
        }
        return length == 1 ? sum[0] : maxSum;
    }
}

