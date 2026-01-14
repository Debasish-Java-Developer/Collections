package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1}; // Input array

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {          // Outer loop
            for (int j = i + 1; j < arr.length; j++) {  // Inner loop
                if (arr[i] == arr[j]) {                 // Compare elements
                    System.out.println(arr[i]);         // Print duplicate
                    break;                              // Avoid multiple prints
                }
            }
        }
    }
}
