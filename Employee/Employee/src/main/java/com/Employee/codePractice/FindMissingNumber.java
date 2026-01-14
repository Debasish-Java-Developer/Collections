package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Array with missing number
        int n = 5;                // Range is 1 to n
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int actualSum = 0;                 // Sum of array elements
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i]; // Add array elements
        }
        int missingNumber = expectedSum - actualSum; // Find missing number
        System.out.println("Missing number = " + missingNumber);
    }
}
