package Trees;

/*Basic Implementation of Topological Sort*/

import java.util.*;

class Graph {
    private int totalNodes;
    private List<Integer> nodes[];

    Graph(int totalNodes) {
        this.totalNodes = totalNodes;
        nodes = new LinkedList[totalNodes];
        for (int i = 0; i < totalNodes; i++) nodes[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        nodes[v].add(w);
    }

    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[totalNodes];
        for (int i = 0; i < totalNodes; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < totalNodes; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop()+" ");
        }

    }

    void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack) {
        visited[v] = true;
        for (Integer node : nodes[v]) {
            if (!visited[node]) {
                topologicalSortUtil(node, visited, stack);
            }
        }

        stack.push(v);

    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.topologicalSort();
    }

}
