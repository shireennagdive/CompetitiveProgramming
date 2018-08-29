public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int A[] = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
        int max, low = 0, high = A.length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            max = A[mid];
            if (mid != high && max < A[mid + 1]) {
                low = mid + 1;
            } else if (max < A[mid - 1]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return mid;
    }

}