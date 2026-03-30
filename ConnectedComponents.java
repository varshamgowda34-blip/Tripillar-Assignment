package assignment5.module14;

import java.util.*;

public class ConnectedComponents {

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                dfs(nei, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Component 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // Component 2
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Node 4 is separate → Component 3

        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj);
                count++;
            }
        }

        System.out.println("Number of Connected Components: " + count);
    }
}