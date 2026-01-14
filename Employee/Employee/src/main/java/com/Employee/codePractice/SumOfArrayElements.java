package com.Employee.codePractice;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40}; // Input array
        int sum = 0;                  // Variable to store sum
        for (int i = 0; i < arr.length; i++) { // Loop through array
            sum = sum + arr[i];                // Add each element
        }
        System.out.println("Sum of array elements = " + sum);
    }
}
