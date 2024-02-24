package org.example.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackTracking {
    // Entry point method to generate letter combinations
    public static List<String> letterCombinations(String digits) {
        // List to store the result of letter combinations
        List<String> result = new ArrayList<>();

        // Check if the input digits are null or empty
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        // Map to store the mapping of each digit to its corresponding letters
        Map<Character, String> digitMap = new HashMap<>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        // Call the backtrack method to generate letter combinations
        backtrack(result, digitMap, digits, "", 0);

        // Return the final result
        return result;
    }

    // Backtracking method to generate letter combinations
    private static void backtrack(List<String> result, Map<Character, String> digitMap,
                                  String digits, String current, int index) {
        // Base case: If the current combination has the same length as input digits, add it to the result
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get the current digit
        char digit = digits.charAt(index);

        // Get the letters corresponding to the current digit
        String letters = digitMap.get(digit);

        // Iterate through each letter and make recursive calls
        for (char letter : letters.toCharArray()) {
            // Make a recursive call with the updated combination and move to the next digit
            backtrack(result, digitMap, digits, current + letter, index + 1);
        }
    }

        public List<List<Integer>> permute(int[] nums) {
            if(nums.length == 0)return new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            backtrack(result,nums, 0,current );
            return result;
        }
        private void backtrack(List<List<Integer>> result, int[] nums, int index, List<Integer> current){
            if(index == nums.length){
                result.add(new ArrayList<>(current));
                return;
            }
            int digit = nums[index];
            for(int num: nums){
                if(!current.contains(num)){
                    current.add(num);
                    backtrack(result,nums, index+1, current);
                    current.remove(current.size()-1);
                }

            }

        }

            }
