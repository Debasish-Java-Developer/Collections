package com.Employee.codePractice;

import java.util.Arrays;

public class FindSecondLargestUsingStream {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 78, 34}; // Input array
        int secondLargest = Arrays.stream(arr) // Convert array to stream
                .distinct()  // Remove duplicates
                .boxed()     // Convert int to Integer
                .sorted((a, b) -> b - a) // Sort descending
                .skip(1)     // Skip largest element
                .findFirst() // Get second element
                .get();
        System.out.println("Second Largest = " + secondLargest);
    }
}
