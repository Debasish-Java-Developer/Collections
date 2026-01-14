package com.Employee.codePractice;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        int base = 2;     // Base number
        int exponent = 5; // Power
        long result = 1;  // Store result
        for (int i = 1; i <= exponent; i++) { // Multiply base exponent times
            result = result * base;
        }
        System.out.println("Result = " + result);
    }
}
