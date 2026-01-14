package com.Employee.codePractice;

import java.util.Arrays;

public class RemoveDuplicatesFromArrayUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1}; // Input array
        int[] uniqueArray = Arrays.stream(arr) // Convert array to stream
                .distinct()  // Remove duplicates
                .toArray();  // Convert back to array
        // Print array without duplicates
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
