package org.example.Leetcode;

public class PrefixSum {
        public static void main(String[] args) {
            int[] inputArray = {1, 2, 3, 4, 5};
            int[] prefixSumArray = calculatePrefixSum(inputArray);

            // Print the original array
            System.out.print("Original Array: ");
            printArray(inputArray);

            // Print the prefix sum array
            System.out.print("Prefix Sum Array: ");
            printArray(prefixSumArray);
        }

        // Function to calculate the prefix sum of an array
        private static int[] calculatePrefixSum(int[] arr) {
            int n = arr.length;
            int[] prefixSum = new int[n];

            prefixSum[0] = arr[0];

            // Calculate the prefix sum
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }

            return prefixSum;
        }

        // Function to print an array
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


}
