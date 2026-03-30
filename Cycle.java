package assignment5.module14;

import java.util.*;

public class Cycle {
    static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, node, visited, adj)) return true;
            } else if (nei != parent) {
                return true;
            }
        }
        return false;
    }
}