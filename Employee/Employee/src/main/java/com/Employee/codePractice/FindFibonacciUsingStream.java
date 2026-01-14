package com.Employee.codePractice;

import java.util.stream.Stream;

public class FindFibonacciUsingStream {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        Stream.iterate(new int[]{0, 1},        // Initial values
                        f -> new int[]{f[1], f[0] + f[1]}) // Generate next pair
                .limit(n)                         // Limit to n terms
                .map(f -> f[0])                   // Extract Fibonacci number
                .forEach(num -> System.out.print(num + " "));
    }
}
