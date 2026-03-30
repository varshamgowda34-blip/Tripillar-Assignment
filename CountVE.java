package assignment5.module14;

import java.util.*;

public class CountVE {

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);

        int edges = 0;

        for (int i = 0; i < V; i++) {
            edges += adj.get(i).size();
        }

        edges = edges / 2; // undirected graph

        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges);
    }
}
