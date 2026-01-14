package com.Employee.codePractice;

public class RemoveSpacesFromStringUsingStreams {
    public static void main(String[] args) {
        String str = "hello world java"; // Input string
        String result = str.chars()               // Stream of characters
                .filter(c -> c != ' ') // Remove spaces
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> a + b); // Join characters
        System.out.println("After removing spaces: " + result);
    }
}
