import java.util.HashMap;
import java.util.LinkedList;

public class CloneGraph {
    /**
     * Definition for undirected graph.
     * class UndirectedGraphNode {
     *     int label;
     *     List<UndirectedGraphNode> neighbors;
     *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
     * };
     */
    public class Solution {
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            if(node==null) return null;
            Queue<UndirectedGraphNode> queue = new LinkedList<>();

            Map<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
            map.put(node, new UndirectedGraphNode(node.label));
            queue.offer(node);

            while(!queue.isEmpty()){
                UndirectedGraphNode n = queue.poll();
                for(UndirectedGraphNode childNode : n.neighbors){
                    if(!map.containsKey(childNode)){
                        map.put(childNode, new UndirectedGraphNode(childNode.label));
                        queue.offer(childNode);
                    }
                    map.get(n).neighbors.add(map.get(childNode));
                }
            }

            return map.get(node);
        }
    }
}
