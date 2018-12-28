import java.util.Iterator;
import java.util.List;

public class Flatten2DVector {
    public class Vector2D implements Iterator<Integer> {

        Iterator<Integer> curr;
        Iterator<List<Integer>> it;

        public Vector2D(List<List<Integer>> vec2d) {
            it=vec2d.iterator();
            curr=null;
        }

        @Override
        public Integer next() {
            return curr.next();
        }

        @Override
        public boolean hasNext() {
            while((curr==null || !curr.hasNext()) && it.hasNext()){
                curr=it.next().iterator();
            }
            return curr!=null && curr.hasNext();
        }

    }

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
