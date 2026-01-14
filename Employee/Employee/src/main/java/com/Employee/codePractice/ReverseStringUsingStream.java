package com.Employee.codePractice;

import java.util.stream.IntStream;

public class ReverseStringUsingStream {
    public static void main(String[] args) {
        String str = "hello"; // Input string
        String reversed =
                IntStream.range(0, str.length())          // Create index stream
                        .mapToObj(i -> str.charAt(str.length() - 1 - i)) // Reverse order
                        .map(String::valueOf)             // Convert char to String
                        .reduce("", (a, b) -> a + b);     // Join characters
        System.out.println("Reversed String = " + reversed);
    }
}
