package com.Employee.codePractice;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class FindDuplicatesUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1}; // Input array
        Set<Integer> seen = new HashSet<>(); // Store unique elements
        System.out.println("Duplicate elements:");
        Arrays.stream(arr)                 // Convert array to stream
                .filter(num -> !seen.add(num)) // add() returns false for duplicates
                .forEach(System.out::println); // Print duplicates
    }
}
