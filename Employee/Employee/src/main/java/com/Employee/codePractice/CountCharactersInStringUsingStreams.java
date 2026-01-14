package com.Employee.codePractice;

public class CountCharactersInStringUsingStreams {
    public static void main(String[] args) {
        String str = "hello world"; // Input string
        long count = str.chars()           // Create stream of characters
                .filter(c -> c != ' ') // Ignore spaces
                .count();              // Count characters
        System.out.println("Character count = " + count);
    }
}
