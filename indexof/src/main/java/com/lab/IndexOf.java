package com.lab;

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. If n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n) {
        // Loop through the array to find the first occurrence of the number 'n'
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element equals the target value 'n'
            if (arr[i] == n) {
                // If found, return the index of the element
                return i;
            }
        }
        // If not found, return -1
        return -1;
    }
}