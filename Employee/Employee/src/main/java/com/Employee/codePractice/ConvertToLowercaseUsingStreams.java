package com.Employee.codePractice;

public class ConvertToLowercaseUsingStreams {
    public static void main(String[] args) {
        String str = "JAVA"; // Input string
        String lower = str.chars()
                .map(c -> (c >= 'A' && c <= 'Z') ? c + 32 : c)
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> a + b);
        System.out.println("Lowercase = " + lower);
    }
}
