package org.example.Leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public List<Integer> allPossiblePathSums(TreeNode root) {
        List<Integer> pathSums = new ArrayList<>();
        dfs(root, 0, pathSums);
        return pathSums;
    }

    private void dfs(TreeNode node, int currentSum, List<Integer> pathSums) {
        if (node == null) {
            return;
        }

        currentSum += node.val;

        if (node.left == null && node.right == null) {
            pathSums.add(currentSum);
            return;
        }

        dfs(node.left, currentSum, pathSums);
        dfs(node.right, currentSum, pathSums);
    }

    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<s.length();i++){
            int first = Integer.parseInt(s.substring(0,i+1),2);
            int second = Integer.parseInt(s.substring(i+1),2);
            max = Math.max(max, first+second);
        }
        return max;
    }

    public String largestOddNumber(String num) {
        for(int i = 0;i<num.length();i++){
            String currentString = num.substring(0, num.length()-i);
            if(currentString.endsWith("1") ||currentString.endsWith("3") || currentString.endsWith("5")
        || currentString.endsWith("7") || currentString.endsWith("9")){
                return currentString;
            }
        }
        return "";
    }

}
