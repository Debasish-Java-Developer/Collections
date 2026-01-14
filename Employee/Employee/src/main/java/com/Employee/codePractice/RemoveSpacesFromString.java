package com.Employee.codePractice;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "hello world java"; // Input string
        String result = "";              // Store string without spaces
        for (int i = 0; i < str.length(); i++) { // Loop through string
            char ch = str.charAt(i);              // Get each character
            if (ch != ' ') {                      // If not space
                result = result + ch;             // Append character
            }
        }
        System.out.println("After removing spaces: " + result);
    }
}
