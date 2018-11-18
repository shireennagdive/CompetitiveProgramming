public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        int n = A.length,inc=0,dec=0;
        for(int i=1;i<n;i++){
            if(A[i-1]<A[i]) inc++;
            else if(A[i-1]>A[i]) dec++;
            else {inc++;dec++;}
        }
        return (inc==n-1 || dec==n-1);
    }
}
