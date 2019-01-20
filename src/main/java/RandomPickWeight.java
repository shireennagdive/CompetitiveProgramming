import java.util.Random;

public class RandomPickWeight {

        int[] nums;
        Random rnd;

        public RandomPickWeight(int[] nums) {
            this.nums = nums;
            this.rnd = new Random();
        }

        public int pick(int target) {
            int result = -1;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != target)
                    continue;
                if (rnd.nextInt(++count) == 0)
                    result = i;
            }

            return result;
        }

        public static void main(String[] args){
            RandomPickWeight r = new RandomPickWeight(new int[]{1,2,2,3,3,3});
            System.out.println(r.pick(3));

        }
}
