package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 45, 2, 78, 34}; // Input array

        int largest = Integer.MIN_VALUE;       // Store largest value
        int secondLargest = Integer.MIN_VALUE; // Store second largest value

        for (int i = 0; i < arr.length; i++) { // Loop through array
            if (arr[i] > largest) {             // If current element is larger
                secondLargest = largest;        // Update second largest
                largest = arr[i];               // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];         // Update second largest
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
