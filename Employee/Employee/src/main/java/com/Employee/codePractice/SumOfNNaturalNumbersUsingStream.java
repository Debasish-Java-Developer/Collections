package com.Employee.codePractice;

import java.util.stream.IntStream;

public class SumOfNNaturalNumbersUsingStream {
    public static void main(String[] args) {
        int n = 10; // First N natural numbers
        int sum = IntStream.rangeClosed(1, n) // Numbers from 1 to n
                .sum();            // Sum all numbers
        System.out.println("Sum = " + sum);
    }
}

