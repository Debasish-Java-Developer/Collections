package com.Employee.codePractice;

public class FindNumberOfDigitsUsingStream {
    public static void main(String[] args) {
        int num = 12345; // Number whose digits are to be counted
        long count = String.valueOf(num) // Convert number to String
                .chars()      // Create stream of characters
                .count();     // Count characters
        System.out.println("Number of digits = " + count);
    }
}
