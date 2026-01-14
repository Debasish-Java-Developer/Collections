package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindPowerUsingStream {
    public static void main(String[] args) {
        int base = 2;     // Base number
        int exponent = 5; // Power
        long result = IntStream.rangeClosed(1, exponent) // Range for multiplication
                .reduce(1, (a, b) -> a * base);
        System.out.println("Result = " + result);
    }
}
