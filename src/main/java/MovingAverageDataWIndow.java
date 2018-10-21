public class MovingAverageDataWIndow {

        /** Initialize your data structure here. */
        int count=0, pos=0,size;
        double sum = 0;
        int[] values;

        public MovingAverageDataWIndow(int size) {
            sum=0;
            count=0;
            values = new int[size];
            this.size = size;
        }

        public double next(int val) {
            pos++;
            sum+= val-values[(pos-1)%size];
            values[(pos-1)%size] = val;
            if(pos<size){
                return sum/pos;
            }else{
                return sum/size;
            }
        }
    }

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

