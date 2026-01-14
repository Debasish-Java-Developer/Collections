package com.Employee.codePractice;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming"; // Input string
        char[] chars = str.toCharArray(); // Convert string to char array
        System.out.println("Duplicate characters:");
        for (int i = 0; i < chars.length; i++) {        // Outer loop
            for (int j = i + 1; j < chars.length; j++) { // Inner loop
                if (chars[i] == chars[j]) {              // Compare characters
                    System.out.println(chars[i]);        // Print duplicate
                    break;                               // Avoid repeated print
                }
            }
        }
    }
}
