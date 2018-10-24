public class PascalsTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalRes = new ArrayList<>();
        if (numRows==0) return finalRes;

        finalRes.add(0,new ArrayList<Integer>());
        finalRes.get(0).add(1);

        for(int i=1;i<numRows;i++){
            List<Integer> prev = finalRes.get(i-1);
            List<Integer> current = new ArrayList<>();

            current.add(1);

            for(int j=1;j<prev.size();j++){
                current.add(prev.get(j)+prev.get(j-1));
            }
            current.add(1);

            finalRes.add(current);
        }
        return finalRes;
    }
}
