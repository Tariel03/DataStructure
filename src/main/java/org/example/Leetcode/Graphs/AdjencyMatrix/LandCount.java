package org.example.Leetcode.Graphs.AdjencyMatrix;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LandCount {
    public int landCount(char[][] grid){
        Set<String> visited = new HashSet<>();
        int counter = 0;
        for(int i = 0;i < grid.length; i++){
            for(int j =0; j<grid[i].length; j++){
                if(bfs(grid, i, j, visited)){
                    counter++;
                }

            }
        }
        return counter;
    }
    public boolean bfs(char [][] grid, int row, int column, Set<String> visited){
        if(row < 0 || column < 0 || row >= grid.length || column >= grid[0].length){
            return false;
        }
        if(grid[row] [column] == 'W' ){
            return false;
        }
        String position = row + "," + column;
        if(visited.contains(position))return false;
        visited.add(position);

        bfs(grid, row-1, column,visited);
        bfs(grid, row, column-1,visited);
        bfs(grid, row+1, column,visited);
        bfs(grid, row, column+1,visited);
        return true;


    }
}
