package org.example.Leetcode.DynamicProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPathSum {
    public int maxSum(int row, int column, List<List<Integer>> grid){
        if(row == grid.size() || column == grid.get(0).size()){
            return (int) Double.NEGATIVE_INFINITY;
        }
        if(row == grid.size() -1 && column == grid.get(0).size()-1 ){
            return grid.get(row).get(column);
        }
        int a = maxSum(row+1, column, grid);
        int b  = maxSum(row,column+1, grid);
        return grid.get(row).get(column) + Math.max(a,b);


    }

    public int maxSum(int row, int column, List<List<Integer>> grid, HashMap<List<Integer>, Integer> map){
        if(row == grid.size() || column == grid.get(0).size()){
            return (int) Double.NEGATIVE_INFINITY;
        }
        if(row == grid.size() -1 && column == grid.get(0).size()-1 ){
            return grid.get(row).get(column);
        }
        List<Integer> list = List.of(row, column);
        if(map.containsKey(list)){
            return map.get(list);
        }
        int a = maxSum(row+1, column, grid);
        int b  = maxSum(row,column+1, grid);
        int result = grid.get(row).get(column) + Math.max(a,b);
        map.put(list, result);
        return result ;


    }
}
