package com.lab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfTest {
    // Declare the IndexOf object that will be used in all test cases
    public static IndexOf io;

    /**
     * This method runs once before all test cases.
     * It initializes the IndexOf object.
     */
    @BeforeAll
    public static void setUp() {
        // Initialize the IndexOf object before any test case runs
        io = new IndexOf();
    }

    /**
     * Test case 1: In the array {0, 1, 2, 7, 4}, the value 7 should be at position 3.
     */
    @Test
    public void indexTest1() {
        // Array to search in
        int[] input = {0, 1, 2, 7, 4};
        // The value to find the index of
        int target = 7;
        // The expected position of the target value in the array
        int expected = 3;
        // Assert that the result of getIndex matches the expected value
        assertEquals(expected, io.getIndex(input, target));
    }

    /**
     * Test case 2: In the array {9, 5, 8, 7, 1}, the value 9 should be at position 0.
     */
    @Test
    public void indexTest2() {
        // Array to search in
        int[] input = {9, 5, 8, 7, 1};
        // The value to find the index of
        int target = 9;
        // The expected position of the target value in the array
        int expected = 0;
        // Assert that the result of getIndex matches the expected value
        assertEquals(expected, io.getIndex(input, target));
    }

    /**
     * Test case 3: In the array {9, 5, 8, 7, 1}, the value 3 does not exist, so getIndex should return -1.
     */
    @Test
    public void indexTest3() {
        // Array to search in
        int[] input = {9, 5, 8, 7, 1};
        // The value to find the index of
        int target = 3;
        // The expected result, which is -1 as 3 does not exist in the array
        int expected = -1;
        // Assert that the result of getIndex matches the expected value
        assertEquals(expected, io.getIndex(input, target));
    }

    /**
     * Test case 4: In an empty array, no value exists, so getIndex should return -1 for any value.
     */
    @Test
    public void indexTest4() {
        // An empty array
        int[] input = {};
        // The value to find the index of
        int target = 7;
        // The expected result is -1 since the array is empty
        int expected = -1;
        // Assert that the result of getIndex matches the expected value
        assertEquals(expected, io.getIndex(input, target));
    }

    /**
     * Test case 5: In the array {1, 2, 3, 7, 7}, the value 7 should be at position 3 (first occurrence).
     */
    @Test
    public void indexTest5() {
        // Array to search in
        int[] input = {1, 2, 3, 7, 7};
        // The value to find the index of
        int target = 7;
        // The expected position of the first occurrence of 7
        int expected = 3;
        // Assert that the result of getIndex matches the expected value
        assertEquals(expected, io.getIndex(input, target));
    }
}