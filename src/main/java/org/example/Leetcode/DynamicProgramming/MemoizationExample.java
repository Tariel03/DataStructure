package org.example.Leetcode.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class MemoizationExample {
    // Map to store computed values
    private Map<Integer, Integer> memo = new HashMap<>();

    public int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Check if the result is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute and memoize the result
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        MemoizationExample example = new MemoizationExample();

        // Example usage of the fibonacci function with memoization
        System.out.println(example.fibonacci(5));  // Output: 5
        System.out.println(example.fibonacci(10)); // Output: 55
    }
}

