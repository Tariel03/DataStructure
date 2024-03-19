package org.example.Leetcode.Graphs.AdjencyMatrix;

import java.util.LinkedList;
import java.util.Queue;

public class BFSInGraphWithArray {
    static void BFS(int[][] graph, int start) {
        int vertices = graph.length;
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < vertices; i++) {
                if (graph[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 1},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 0}
        };

        System.out.println("Breadth First Traversal starting from vertex 0:");
        BFS(graph, 0);
    }
}
