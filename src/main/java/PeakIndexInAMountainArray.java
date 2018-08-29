public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int A[] = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
        int low = 0, high = A.length - 1, mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return mid;
    }

}