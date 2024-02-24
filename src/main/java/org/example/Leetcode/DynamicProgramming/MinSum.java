package org.example.Leetcode.DynamicProgramming;

import java.util.List;

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
}
