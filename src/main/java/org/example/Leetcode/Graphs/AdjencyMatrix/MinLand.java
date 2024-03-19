package org.example.Leetcode.Graphs.AdjencyMatrix;

import java.util.HashSet;
import java.util.Set;

public class MinLand {
    public static void main(String[] args) {
        char[][] grid = {
                {'L', 'W', 'L', 'L', 'W'},
                {'W', 'L', 'W', 'W', 'L'},
                {'L', 'W', 'L', 'L', 'W'},
                {'W', 'L', 'W', 'W', 'L'},
                {'L', 'L', 'L', 'L', 'L'}
        };
        System.out.println(minLand(grid));
        System.out.println(maxLand(grid));
    }

    public static int minLand(char[][] graph) {
        Set<String> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (!set.contains(i + "," + j) && graph[i][j] == 'L') {
                    min = Math.min(dfs(graph, i, j, set), min);
                }
            }
        }
        return min;
    }
    public static int maxLand(char[][] graph){
        Set<String> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (!set.contains(i + "," + j) && graph[i][j] == 'L') {
                    max = Math.max(dfs(graph, i, j, set), max);
                }
            }
        }
        return max;

    }

    public static int dfs(char[][] graph, int row, int column, Set<String> set) {
        if (row >= graph.length || row < 0 || column >= graph[0].length || column < 0
                || set.contains(row + "," + column) || graph[row][column] == 'W') {
            return 0;
        }
        String pos = row + "," + column;
        set.add(pos);
        return 1 + dfs(graph, row, column + 1, set) + dfs(graph, row, column - 1, set)
                + dfs(graph, row + 1, column, set) + dfs(graph, row - 1, column, set);
    }

}
