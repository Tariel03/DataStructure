package org.example.Leetcode.DynamicProgramming;

import java.util.Map;

public class Tribonacci {
    public int tribonacci(int n){
        if(n == 0 || n ==1) return 0;
        if(n == 2) return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
    public int memoTribonacci(int n, Map<Integer, Integer> map){
        if(n==0 || n==1) return 0;
        if(n == 2) return 1;
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = memoTribonacci(n-1, map) + memoTribonacci(n-2, map)
                +memoTribonacci(n-3, map);
        map.put(n, result);
        return result;
    }
}
