public class CircularQueue {


        int A[];
        int head,tail;
        int len;
        int k;
        public CircularQueue(int k){
            A = new int[k];
            head=0;
            tail=-1;
            len=0;
            this.k = k;
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value){
            if(len==k){
                return false;
            }

            tail = (tail+1)%A.length;
            A[tail] = value;
            len++;
            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue(){
            if(len==0){
                return false;
            }
            head = (head+1)%A.length;

            len--;

            return true;
        }

        /** Get the front item from the queue. */
        public int Front(){
            if(len==0){
                return -1;
            }
            return A[head];
        }

        /** Get the last item from the queue. */
        public int Rear(){
            if(len==0){
                return -1;
            }
            return A[tail];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty(){
            return len==0;
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            return len==this.k;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
