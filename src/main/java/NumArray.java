package main.java;

public class NumArray {

    private int nums[];

    private NumArray(int[] nums) {
        for (int k = 1; k < nums.length; k++) {
            nums[k] += nums[k - 1];
        }
        this.nums = nums;
    }

    public static void main(String[] args) {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }

    private int sumRange(int i, int j) {
        if (i == 0) {
            return nums[j];
        }
        return nums[j] - nums[i - 1];
    }
}
