package assignment5.module14;

import java.util.*;

public class Graph {
    public static void main(String[] args) {
        int V = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);

        System.out.println(adj);
    }
}