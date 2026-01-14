package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindNumbersDivisibleBy3And5UsingStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)              // Numbers from 1 to 100
                .filter(i -> i % 3 == 0 && i % 5 == 0) // Divisible by both
                .forEach(i -> System.out.print(i + " "));
    }
}
