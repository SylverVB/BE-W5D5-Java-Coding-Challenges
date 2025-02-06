package com.lab;

// import java.util.Arrays;
// import java.util.List;

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

        // Option 1. Loop through the array to find the first occurrence of the number 'n'
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element equals the target value 'n'
            if (arr[i] == n) {
                // If found, return the index of the element
                return i;
            }
        }
        // If not found, return -1
        return -1;

        // For large arrays, the above approach is more efficient because it avoids boxing and creating a new list. But for simplicity, indexOf() is a clean solution.

        // Option 2. Using indexOf()
        // // Convert int[] to List<Integer>
        // List<Integer> list = Arrays.stream(arr).boxed().toList();
        
        // // Use indexOf() method to find the position
        // return list.indexOf(n);
    }

    public static void main(String[] args) {
        // Example of using the getIndex method
        IndexOf indexOf = new IndexOf();
        int[] arr = {0, 1, 7, 3, 4};
        int n = 7;
        System.out.println("Index of " + n + ": " + indexOf.getIndex(arr, n));
    }
}