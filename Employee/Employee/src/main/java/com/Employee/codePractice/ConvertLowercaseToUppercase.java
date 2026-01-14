package com.Employee.codePractice;

public class F {
    public static void main(String[] args) {

        String str = "java";      // Input string
        String upper = "";        // Store uppercase string

        for (int i = 0; i < str.length(); i++) { // Loop through string
            char ch = str.charAt(i);              // Get character

            if (ch >= 'a' && ch <= 'z') {         // Check lowercase
                ch = (char) (ch - 32);            // Convert to uppercase
            }

            upper = upper + ch;                   // Append character
        }

        System.out.println("Uppercase = " + upper);
    }
}

