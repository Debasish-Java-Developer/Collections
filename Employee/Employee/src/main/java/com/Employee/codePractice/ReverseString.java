package com.Employee.codePractice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";     // Input string
        String reverse = "";      // Store reversed string
        for (int i = str.length() - 1; i >= 0; i--) { // Loop from end to start
            reverse = reverse + str.charAt(i);        // Append character
        }
        System.out.println("Reversed String = " + reverse);
    }
}
