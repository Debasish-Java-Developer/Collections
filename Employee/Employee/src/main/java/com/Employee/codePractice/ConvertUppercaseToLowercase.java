package com.Employee.codePractice;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String str = "JAVA";      // Input string
        String lower = "";        // Store lowercase string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {          // Check uppercase
                ch = (char) (ch + 32);             // Convert to lowercase
            }
            lower = lower + ch;
        }
        System.out.println("Lowercase = " + lower);
    }
}
