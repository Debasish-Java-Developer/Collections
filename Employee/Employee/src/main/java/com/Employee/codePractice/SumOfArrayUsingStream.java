package com.Employee.codePractice;

import java.util.Arrays;

public class SumOfArrayUsingStream {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40}; // Input array
        int sum = Arrays.stream(arr) // Convert array to stream
                .sum();      // Sum all elements
        System.out.println("Sum of array elements = " + sum);
    }
}

