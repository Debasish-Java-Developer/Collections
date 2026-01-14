package com.Employee.codePractice;

import java.util.stream.IntStream;

public class SortedArrayCheckUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        boolean isSorted =
                IntStream.range(0, arr.length - 1) // Index range
                        .allMatch(i -> arr[i] <= arr[i + 1]); // Check order
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
