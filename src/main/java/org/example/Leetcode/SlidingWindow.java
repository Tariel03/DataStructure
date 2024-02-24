package org.example.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SlidingWindow {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        // Check for invalid input
        if (k > n) {
            System.out.println("Invalid input: Window size is greater than array length.");
            return -1;
        }

        // Calculate the sum of the first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Move the window and calculate the sum for each position
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
    //fixed
    public static List<Integer> sumOfSubArrays(int[]arr, int k){
        List<Integer> list = new ArrayList<>();
        int n = arr.length-1;
        int result = 0;
        for(int i = 0 ;i<k;i++){
            result += arr[i];
        }
        list.add(result);
        for(int i = 1; i<n-k+1;i++){
            result = result  - arr[i-1];
            result = result + arr[i+k-1];
            list.add(result);
        }
        return list;

    }
    public static  int dynamicSlidingWindow(int[] arr, int target){
       int min_length = 1;
       int start = 0;
       int end = 0;
       int current_sum = 0;
       while (end < arr.length){
           current_sum  +=  arr[end];
           end++;
           while( start < end && current_sum >= target){
               current_sum -= arr[start];
               start++;

               min_length = Math.min(min_length, end-start+1);

           }
       }
       return min_length;
    }

    public int maxLengthOfEvenSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < nums.length) {
            if (nums[right] % 2 == 0) {
                // Current element is even, expand the window
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                // Current element is odd, shrink the window
                left = right + 1;
                right = left;
            }
        }

        return maxLength;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum >= target) {
                minLength= Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }

            right++;
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, set.size());
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }

        }
        return maxLength;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 19};
        int k = 4;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + ": " + result);

        System.out.println(sumOfSubArrays(arr,2));
    }
}
