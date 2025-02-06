package com.lab;

public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target) {
        for (int i = 0; i < nums.length; i++) {  // Loops through each row
            for (int j = 0; j < nums[i].length; j++) {  // Loops through each column
                if (nums[i][j] == target) {  // If found, return true
                    return true;
                }
            }
        }
        return false;  // If not found, return false
    }

    public static void main(String[] args) {
        // Example 2D array
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create an instance of Search2dArray
        Search2dArray searcher = new Search2dArray();

        // Test cases
        int target1 = 5;
        int target2 = 10;

        System.out.println("Searching for " + target1 + ": " + searcher.search(nums, target1)); // true
        System.out.println("Searching for " + target2 + ": " + searcher.search(nums, target2)); // false
    }
}