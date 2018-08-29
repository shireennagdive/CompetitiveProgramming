public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int A[] = {1,2,3,4,1000000,4,3,2,1};
        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
        for(int i =0;i<A.length-1;i++){
            if(A[i] > A[i+1]){
                return i;
            }
        }
        return 0;
    }
}
