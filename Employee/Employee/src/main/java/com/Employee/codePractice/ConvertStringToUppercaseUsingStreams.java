package com.Employee.codePractice;

public class ConvertStringToUppercaseUsingStreams {
    public static void main(String[] args) {
        String str = "java"; // Input string
        String upper = str.chars()
                .map(c -> (c >= 'a' && c <= 'z') ? c - 32 : c)
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> a + b);
        System.out.println("Uppercase = " + upper);
    }
}
