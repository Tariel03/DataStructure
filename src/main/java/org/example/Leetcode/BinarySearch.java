package org.example.Leetcode;

import java.util.Arrays;

public class BinarySearch {
    public int findIndexOfNumber(int[] array, int target) {
        Arrays.sort(array);

        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[midIndex] == target) {
                return midIndex; // Target found
            } else if (array[midIndex] < target) {
                startIndex = midIndex + 1; // Search in the right half
            } else {
                endIndex = midIndex - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 4, 7, 10, 15, 18, 22};
        int target = 15;
        int result = binarySearch.findIndexOfNumber(array, target);

        if (result != -1) {
            System.out.println("Index of " + target + " is: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}

