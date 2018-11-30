import java.util.Arrays;

class FindClosestNumberInArray {
    public static void main(String[] args) {
        // int houses[] = new int[]{};
        int houses[] = new int[]{22,44,55,88,99,2210,19,18,17,13,55,33,77,777,11111,11111,99,99,99,99};
        int stores[] = new int[]{1,5,4,7,9,2,33,44,55,11,77,65,43,88,99,34,10};

        int[] result = solution(houses, stores);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

    public static int[] solution(int[] houses, int[] stores) {
        Arrays.sort(stores);
        int[] result = new int[houses.length];
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] <= stores[0]) result[i] = stores[0];
            else if (houses[i] >= stores[stores.length - 1]) result[i] = stores[stores.length - 1];
            else {
                result[i] = getClosest(stores, houses[i]);
            }
        }
        return result;
    }


    public static int getClosest(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (target == nums[mid]) {
                return nums[mid];
            } else if (target < nums[mid]) {
                if (mid > 0 && target > nums[mid - 1]) {
                    return (target - nums[mid - 1] <= nums[mid] - target ? nums[mid - 1] : nums[mid]);
                }
                high = mid;
            } else {
                if (mid < nums.length - 1 && target < nums[mid + 1]) {
                    return (target - nums[mid] <= nums[mid + 1] - target ? nums[mid] : nums[mid + 1]);
                }
                low = mid + 1;
            }
        }
        return nums[mid];
    }
}