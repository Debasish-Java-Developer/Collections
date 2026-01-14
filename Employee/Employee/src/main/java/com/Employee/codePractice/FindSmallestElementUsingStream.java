package com.Employee.codePractice;

import java.util.Arrays;

public class FindSmallestElementUsingStream {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 78, 34}; // Input array
        int smallest = Arrays.stream(arr) // Convert array to stream
                .min()       // Find minimum value
                .getAsInt();
        System.out.println("Smallest element = " + smallest);
    }
}

