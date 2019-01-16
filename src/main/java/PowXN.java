class PowXN {
    public double myPow(double x, int n) {

        if(n==1) return x;
        if(n==-1){
            return 1/x;
        }
        if(n==0) return 1;

        if(n%2==0){
            double a = myPow(x,n/2);
            return a*a;
        }
        double a = myPow(x,(n-1)/2);

        return x*a*a;
    }
}