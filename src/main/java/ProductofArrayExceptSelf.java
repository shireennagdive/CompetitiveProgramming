public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        int[] nums = {1, 2, 0,4};
        int[] output = productofArrayExceptSelf.productExceptSelf(nums);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i++) {
            output[i] = temp;
            temp *= nums[i];
        }

        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            output[i] = output[i] * temp;
            temp *= nums[i];
        }

        return output;
    }
}
