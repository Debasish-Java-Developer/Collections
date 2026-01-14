package com.Employee.codePractice;

public class CountCharactersInString {
    public static void main(String[] args) {
        String str = "hello world"; // Input string
        int count = 0;              // Variable to count characters
        for (int i = 0; i < str.length(); i++) { // Loop through string
            if (str.charAt(i) != ' ') {          // Ignore spaces
                count++;                         // Increase count
            }
        }
        System.out.println("Character count = " + count);
    }
}
