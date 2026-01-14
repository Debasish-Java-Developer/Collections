package com.Employee.codePractice;

public class FindSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 78, 34}; // Input array
        int smallest = arr[0];          // Assume first element is smallest
        for (int i = 1; i < arr.length; i++) { // Loop from second element
            if (arr[i] < smallest) {            // Compare
                smallest = arr[i];              // Update smallest
            }
        }
        System.out.println("Smallest element = " + smallest);
    }
}
