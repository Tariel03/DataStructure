package org.example.Leetcode.DynamicProgramming;

import java.util.List;
import java.util.Map;

public class SumPossible {
    private boolean sumPossible(List<Integer> nums, int target){
        if(target == 0) return true;
        if(target < 0) return false;
        for(int num : nums){
            int sum = target- num;
            if(sumPossible(nums, sum)){
                return true;
            }
        }
        return false;

    }
    private boolean sumPossible(List<Integer> nums, int target, Map<Integer, Boolean> map){
        if(target == 0) return true;
        if(target<0) return false;
        if(map.containsKey(target)){
            return map.get(target);
        }
        for(int num : nums){
            int sum = target-num;
            if(sumPossible(nums, sum, map )){
                map.put(sum, true);
                return true;
            }

        }
        map.put(target, false);
        return false;

    }
}
