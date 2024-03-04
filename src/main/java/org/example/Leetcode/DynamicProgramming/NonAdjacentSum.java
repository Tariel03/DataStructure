package org.example.Leetcode.DynamicProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonAdjacentSum {
     public int nonAdjacentNum(List<Integer> nums, int i ){
      if(i >= nums.size()){
          return 0;
      }
      int a = nums.get(i) + nonAdjacentNum(nums, i+2);
      int b = nonAdjacentNum(nums, i+1);
      return Math.max(a,b);
     }
     public int nonAdjacentNum(List<Integer> nums, int i, HashMap<Integer, Integer> map){
         if(i >= nums.size()){
             return 0;
         }
         if(map.containsKey(i)){
             return map.get(i);
         }
         int a = nums.get(i) + nonAdjacentNum(nums, i+2,map);
         int b = nonAdjacentNum(nums, i+1,map);
         int max = Math.max(a,b);
         map.put(i, max);   
         return max;
     }
}
