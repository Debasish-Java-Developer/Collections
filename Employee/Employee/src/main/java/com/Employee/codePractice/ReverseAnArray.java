package com.Employee.codePractice;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        int start = 0;               // Starting index
        int end = arr.length - 1;    // Ending index
        while (start < end) {        // Loop until pointers meet
            int temp = arr[start];   // Swap elements
            arr[start] = arr[end];
            arr[end] = temp;
            start++;                 // Move start forward
            end--;                   // Move end backward
        }
        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
