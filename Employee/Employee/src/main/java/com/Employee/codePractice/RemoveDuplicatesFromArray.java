package com.Employee.codePractice;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1}; // Input array
        int[] temp = new int[arr.length]; // Temporary array
        int index = 0;                    // Index for temp array
        for (int i = 0; i < arr.length; i++) {   // Loop through array
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {    // Check already added elements
                if (arr[i] == temp[j]) {
                    isDuplicate = true;          // Duplicate found
                    break;
                }
            }
            if (!isDuplicate) {                  // If not duplicate
                temp[index] = arr[i];            // Add to temp array
                index++;
            }
        }
        // Print array without duplicates
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
