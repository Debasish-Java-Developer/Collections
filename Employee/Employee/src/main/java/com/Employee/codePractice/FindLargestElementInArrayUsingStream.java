package com.Employee.codePractice;

import java.util.Arrays;

public class FindLargestElementInArrayUsingStream {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 78, 34}; // Input array
        int largest = Arrays.stream(arr) // Convert array to stream
                .max()       // Find maximum value
                .getAsInt();
        System.out.println("Largest element = " + largest);
    }
}
