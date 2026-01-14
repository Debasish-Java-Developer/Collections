package com.Employee.codePractice;

import java.util.Arrays;

public class FindMissingNumberUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Array with missing number
        int n = 5;                // Range is 1 to n
        int expectedSum = n * (n + 1) / 2;      // Expected sum
        int actualSum = Arrays.stream(arr).sum(); // Sum using stream
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number = " + missingNumber);
    }
}
