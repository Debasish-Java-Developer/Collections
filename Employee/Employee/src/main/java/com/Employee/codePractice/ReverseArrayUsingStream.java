package com.Employee.codePractice;

import java.util.stream.IntStream;

public class ReverseArrayUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        int[] reversed = IntStream.range(0, arr.length) // Index stream
                .map(i -> arr[arr.length - 1 - i]) // Reverse order
                .toArray();
        // Print reversed array
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
