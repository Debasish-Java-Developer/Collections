package com.Employee.codePractice;

import java.util.stream.IntStream;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "madam"; // Input string
        boolean isPalindrome =
                IntStream.range(0, str.length() / 2) // Check only till middle
                        .allMatch(i ->
                                str.charAt(i) == str.charAt(str.length() - 1 - i)
                        );
        if (isPalindrome) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
