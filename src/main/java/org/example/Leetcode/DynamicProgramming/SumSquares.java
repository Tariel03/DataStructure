package org.example.Leetcode.DynamicProgramming;

import java.util.HashMap;

public class SumSquares {
    public int sumSquares(int n){
        if(n==0) return 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<=Math.sqrt(n);i++){
            int square = i*i;
            int num = 1+ sumSquares(n-square);
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    public int sumSquares(int n, HashMap<Integer, Integer> map){
        if(n==0) return 0;
        if(map.containsKey(n)){
            return map.get(n);
        }
        int min = n;
        for(int i = 1; i<=Math.sqrt(n);i++){
            int square = i*i;
            int num = 1+ sumSquares(n-square,map);
            if(num < min){
                min = num;
            }
        }
        map.put(n, min);
        return min;

    }
}
