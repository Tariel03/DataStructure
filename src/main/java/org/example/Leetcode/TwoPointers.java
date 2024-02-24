package org.example.Leetcode;
public class TwoPointers {
    //for sorted arrays!
    public static int[] findPair(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // Found the pair with the target sum
                return new int[]{numbers[left], numbers[right]};
            } else if (currentSum < target) {
                // Move the left pointer to the right to increase the sum
                left++;
            } else {
                // Move the right pointer to the left to decrease the sum
                right--;
            }
        }

        // If no pair is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 6};
        int targetSum = 8;

        int[] result = findPair(sortedArray, targetSum);

        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found with the target sum.");
        }
    }
}

