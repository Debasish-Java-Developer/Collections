package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8}; // Input array
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {          // Number of passes
            for (int j = 0; j < n - 1 - i; j++) {  // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {         // If elements are in wrong order
                    int temp = arr[j];             // Swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
