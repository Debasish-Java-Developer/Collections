package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindLargestOfThreeUsingStream {
    public static void main(String[] args) {
        int a = 10;   // First number
        int b = 25;   // Second number
        int c = 15;   // Third number
        int largest = IntStream.of(a, b, c) // Create stream of numbers
                .max()      // Find maximum
                .getAsInt();
        System.out.println("Largest = " + largest);
    }
}
