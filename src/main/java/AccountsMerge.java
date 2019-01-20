import java.util.*;

public class AccountsMerge {
        Set<String> visited;
        List<List<String>> res;
        Map<String, Set<String>> nodes;
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
            res = new ArrayList<>();

            if(accounts.isEmpty()) return res;
            visited = new HashSet<>();
            nodes = new HashMap<>();

            for(List<String> list : accounts){
                String firstNode = list.get(1);
                if(!nodes.containsKey(firstNode)) nodes.put(firstNode, new HashSet<>());

                for(int i=1;i<list.size();i++){
                    nodes.get(firstNode).add(list.get(i));
                    if(!nodes.containsKey(list.get(i)))
                        nodes.put(list.get(i) ,new HashSet<>());
                    nodes.get(list.get(i)).add(firstNode);
                }
            }

            for(List<String> list : accounts){

                if(!visited.contains(list.get(1))){
                    List<String> ans = new ArrayList<>();
                    dfs(list.get(1), ans);
                    Collections.sort(ans);
                    ans.add(0,list.get(0));
                    res.add(new ArrayList<>(ans));
                }

            }

            return res;
        }



        public void dfs(String email, List<String> ans){
            visited.add(email);
            ans.add(email);
            for(String connEmail : nodes.get(email)){
                if(!visited.contains(connEmail)){
                    dfs(connEmail,ans);
                }
            }

    }
}
