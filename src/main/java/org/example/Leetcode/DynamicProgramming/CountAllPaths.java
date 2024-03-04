package org.example.Leetcode.DynamicProgramming;

import java.util.HashMap;
import java.util.List;

public class CountAllPaths {
    public int countPath(int amount, int countId, List<Integer> coins){
        if(amount == 0) return 1;

        int totalWays = 0;

        int value = coins.get(countId);
        for(int q = 0;  q*value <= amount; q++){
            int subAmount = amount - q*value;
            totalWays += countPath(subAmount, countId+1,coins);
        }
        return totalWays;
    }
    public int countPath(int amount, int countId, List<Integer> coins, HashMap<List<Integer>, Integer> map){
        if(amount == 0) return 1;
        if(countId == coins.size()) return 0;
        List<Integer> list = List.of(amount, countId);
        if(map.containsKey(list)){
            return map.get(list);
        }

        int totalWays = 0;

        int value = coins.get(countId);
        for(int q = 0;  q*value <= amount; q++){
            int subAmount = amount - q*value;
            totalWays += countPath(subAmount, countId+1,coins,map);
        }
        map.put(list, totalWays);
        return totalWays;
    }
}
