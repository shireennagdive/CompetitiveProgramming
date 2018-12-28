import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ZigZagIterator {
        Queue<Iterator> queue = new LinkedList<>();
        public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
            if(!v1.isEmpty())queue.offer(v1.iterator());
            if(!v2.isEmpty())queue.offer(v2.iterator());
        }

        public int next() {
            Iterator<Integer> i = queue.poll();
            int val = i.next();
            if(i.hasNext()) queue.add(i);
            return val;
        }

        public boolean hasNext() {

            return !queue.isEmpty();
        }
    }

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */

