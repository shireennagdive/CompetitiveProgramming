import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {
        public int kthSmallest(int[][] matrix, int k) {
            PriorityQueue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair p1, Pair p2){
                    return p1.value - p2.value;
                }
            });
            for(int j=0;j<matrix[0].length;j++){
                queue.offer(new Pair(0,j,matrix[0][j]));
            }
            for(int i=0;i<k-1;i++){
                Pair p = queue.poll();
                if(p.row<matrix.length-1){
                    queue.offer(new Pair(p.row+1,p.col,matrix[p.row+1][p.col]));
                }
            }
            return queue.poll().value;
        }
    }

    class Pair{
        int row;
        int col;
        int value;
        Pair(int row, int col, int value){
            this.row=row;
            this.col=col;
            this.value=value;
        }

    }



//1,5,6,9,12,

