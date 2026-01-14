package com.Employee.codePractice;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;   // First number
        int b = 20;   // Second number
        int temp = a; // Store value of a
        a = b;        // Assign b to a
        b = temp;     // Assign temp (old a) to b
        System.out.println("a = " + a + ", b = " + b);
    }
}
