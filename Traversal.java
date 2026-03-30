package assignment5.module14;

import java.util.*;

public class Traversal {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);

        boolean[] visited = new boolean[V];
        int start = 0;

        System.out.print("Traversal (DFS): ");
        dfs(start, visited, adj);
    }

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nei : adj.get(node)) {
            if (!visited[nei])
                dfs(nei, visited, adj);
        }
    }
}
