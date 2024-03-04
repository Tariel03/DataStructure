package org.example.Leetcode.DynamicProgramming;

import java.util.List;
import java.util.Map;

public class MinSum{
    public int  minChange(int target, List<Integer> coins){
        if(target == 0) return 0;
        if(target < 0) return -1;
        int minCoins = -1;
        for(int coin : coins){
            int subTarget = target - coin;
            int subCoins = minChange(subTarget, coins);
            if(subCoins != -1){
                int numCoins = subCoins+1;
                if(minCoins > numCoins || minCoins == -1){
                    minCoins = numCoins;
                }
            }
        }


        return minCoins;
    }
    public int minChange(int target, List<Integer> coins, Map<Integer, Integer> map){
        if(target == 0) return 0;
        if(target < 0) return -1;
        int minCoins = -1;
        if(map.containsKey(target)){
            return map.get(target);
        }
        for(int coin : coins){
            int subTarget = target - coin;
            int subsCoins = minChange(subTarget, coins, map);

            if(subsCoins != -1){
                int numCoins = subsCoins+1;
                if(minCoins > numCoins || minCoins == -1){
                    minCoins = numCoins;
                }
            }
        }
        map.put(target, minCoins);
        return minCoins;

    }
}
