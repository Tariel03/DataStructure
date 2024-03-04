package org.example.Leetcode.DynamicProgramming;

import java.util.HashMap;
import java.util.List;

public class CountPathsExample {
   public int countPaths(int row, int column, List<List<String>> grid){
       if(row == grid.size() || column == grid.get(0).size() ){
           return 0;
       }
       if(grid.get(row).get(column).equals("X")){
           return 0;
       }

       if(row == grid.size()-1  && column == grid.get(0).size() -1){
           return 1;
       }
       return countPaths(row+1, column, grid) + countPaths(row, column+1, grid);

   }

    public int countPaths(int row, int column, List<List<String>> grid, HashMap<List<Integer>, Integer> map){
        if(row == grid.size() || column == grid.get(0).size() ){
            return 0;
        }
        if(grid.get(row).get(column).equals("X")){
            return 0;
        }

        if(row == grid.size()-1  && column == grid.get(0).size() -1){
            return 1;
        }
        List<Integer> position = List.of(row,column);
        if(map.containsKey(position)){
            return map.get(position);
        }
        int result  = countPaths(row+1, column, grid,map) + countPaths(row, column+1, grid,map);
        map.put(position, result);
        return result;

    }
}
