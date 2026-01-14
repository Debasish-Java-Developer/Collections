package com.Employee.codePractice;

public class SwapTwoNumbersWithoutUsingTemp {
    public static void main(String[] args) {
        int a = 10;   // First number
        int b = 20;   // Second number
        a = a + b;    // a becomes 30
        b = a - b;    // b becomes 10
        a = a - b;    // a becomes 20
        System.out.println("a = " + a + ", b = " + b);
    }
}
