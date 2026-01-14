package com.Employee.codePractice;

public class FindLargestElementOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 78, 34}; // Input array
        int largest = arr[0];           // Assume first element is largest
        for (int i = 1; i < arr.length; i++) { // Loop from second element
            if (arr[i] > largest) {             // Compare
                largest = arr[i];               // Update largest
            }
        }
        System.out.println("Largest element = " + largest);
    }
}
