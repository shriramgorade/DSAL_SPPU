package com.shriram;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphTraversal {

    private int vertices;
    private LinkedList<Integer>[] adj;

    // Constructor
    GraphTraversal(int v) {
        vertices = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge (Undirected graph)
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // BFS
    void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS
    void DFScall(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal:");
        DFS(start, visited);
        System.out.println();
    }

    void DFS(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        GraphTraversal g = new GraphTraversal(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            g.addEdge(src, dest);
        }

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();

        g.BFS(start);
        g.DFScall(start);

        sc.close();
    }
}
