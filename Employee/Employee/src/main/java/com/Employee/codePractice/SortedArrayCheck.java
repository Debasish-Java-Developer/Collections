package com.Employee.codePractice;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        boolean isSorted = true;     // Assume array is sorted
        for (int i = 0; i < arr.length - 1; i++) { // Loop till second last
            if (arr[i] > arr[i + 1]) {              // Check order
                isSorted = false;                   // Not sorted
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
