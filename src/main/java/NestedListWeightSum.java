public class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList) {
        int sum=0;
        return dfs(nestedList,0,1);
    }

    public int dfs(List<NestedInteger> nestedList,int listsum, int depth){
        for(NestedInteger nested : nestedList){
            if(nested.isInteger())
            {
                listsum+=depth*nested.getInteger();
            }
            else{
                listsum+=dfs(nested.getList(),0,depth+1);
            }
        }
        return listsum;
    }
}
