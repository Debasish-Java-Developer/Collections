package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindOddEvenCountUsingStream {
    public static void main(String[] args) {
        int start = 1; // Range start
        int end = 10;  // Range end
        long evenCount = IntStream.rangeClosed(start, end) // Range
                .filter(i -> i % 2 == 0) // Even numbers
                .count();
        long oddCount = IntStream.rangeClosed(start, end)  // Range
                .filter(i -> i % 2 != 0) // Odd numbers
                .count();
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
    }
}

