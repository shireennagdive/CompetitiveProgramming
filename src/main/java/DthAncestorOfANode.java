public class DthAncestorOfANode {
        public static void main(String[] args) {
            int a[] = new int[]   {-1};
            int d = 5,p,temp_d;
            int[] result = new int[a.length];
            for(int i=0;i<a.length;i++){
                temp_d=0;p=i;
                while(temp_d<d){
                    if(p==-1) break;
                    p=a[p];
                    temp_d++;
                }
                result[i] = p;
            }
            for(int res : result){
                System.out.print(res+" ");
            }
        }
}
