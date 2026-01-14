package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {
        String str = "hello world"; // Input string
        str = str.toLowerCase();    // Convert to lowercase for easy check
        int vowels = 0;             // Count vowels
        int consonants = 0;         // Count consonants
        for (int i = 0; i < str.length(); i++) { // Loop through string
            char ch = str.charAt(i);              // Get character
            if (ch >= 'a' && ch <= 'z') {         // Check only letters
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;                     // Vowel found
                } else {
                    consonants++;                 // Consonant found
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
