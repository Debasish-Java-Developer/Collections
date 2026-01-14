package com.Employee.codePractice;

import java.util.stream.IntStream;

public class SortingArrayUsingStream {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8}; // Input array
        int n = arr.length;
        IntStream.range(0, n - 1).forEach(i -> {           // Outer passes
            IntStream.range(0, n - 1 - i).forEach(j -> {   // Inner comparisons
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];                    // Swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            });
        });
        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
