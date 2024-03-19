package org.example.Leetcode.Graphs.AdjencyMatrix;

import java.util.HashSet;
import java.util.Set;

public class DFS {
    public static void main(String[] args) {
        char[][] grid = {
                {'L', 'W', 'L', 'L', 'W'},
                {'W', 'L', 'W', 'W', 'L'},
                {'L', 'W', 'L', 'L', 'W'},
                {'W', 'L', 'W', 'W', 'L'},
                {'L', 'L', 'L', 'L', 'L'}
        };
        dfs(grid);


    }

    public static void dfs(char[][] grid) {
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'L' && !visited.contains(i + "," + j)) {
                    dfsHelper(grid, i, j, visited);
                }
            }
        }
    }

    private static void dfsHelper(char[][] grid, int row, int column, Set<String> visited) {
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || grid[row][column] != 'L' || visited.contains(row + "," + column)) {
            return;
        }

        visited.add(row + "," + column);
        // Perform any operations needed at this node

        dfsHelper(grid, row - 1, column, visited); // Up
        dfsHelper(grid, row, column - 1, visited); // Left
        dfsHelper(grid, row + 1, column, visited); // Down
        dfsHelper(grid, row, column + 1, visited); // Right
    }
}
