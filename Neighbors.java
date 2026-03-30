package assignment5.module14;

import java.util.*;

public class Neighbors {

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);

        int node = 0;

        System.out.println("Neighbors of node " + node + ":");
        for (int nei : adj.get(node)) {
            System.out.print(nei + " ");
        }
    }
}
