package org.example.Leetcode;

import java.math.BigInteger;
import java.util.*;

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

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer> ((a,b) -> b-a);
        for(int n : score){
            q.add(n);
        }
        int max = q.remove();
        int secondMax = q.remove();
        int thirdMax = q.remove();
        String[] a = new String[score.length];
        for(int i = 0 ; i<score.length;i++){
            if(!q.isEmpty()){
                if(score[i] == max){
                    a[i] = "Gold Medal";
                }
                else if(score[i] == secondMax){
                    a[i] = "Silver Medal";
                }
                else if(score[i] == thirdMax){
                    a[i] = "Bronze Medal";
                }else{
                    a[i]= String.valueOf(score[i]);
                }
            }
        }
        return a;
    }

    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }
            if(num > secondMax && max > num){
                thirdMax = secondMax;
                secondMax = num;
            }
            if(num > thirdMax && secondMax > num){
                thirdMax = num;
            }

        }
        if(thirdMax == Integer.MIN_VALUE) return (int) max ;
        return  (int) thirdMax;

    }
        public String reverseOnlyLetters(String s) {
            StringBuilder builder = new StringBuilder(s);
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (Character.isLetter(s.charAt(left)) && Character.isLetter(s.charAt(right))) {
                    char temp = s.charAt(left);
                    builder.setCharAt(left, s.charAt(right));
                    builder.setCharAt(right, temp);
                    left++;
                    right--;
                }
                if (!Character.isLetter(s.charAt(left))) {
                    left++;
                }
                if (!Character.isLetter(s.charAt(right))) {
                    right--;
                }
            }
            return builder.toString();
        }




}
