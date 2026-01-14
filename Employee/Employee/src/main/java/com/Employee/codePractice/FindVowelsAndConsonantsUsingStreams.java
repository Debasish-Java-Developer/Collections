package com.Employee.codePractice;

public class FindVowelsAndConsonantsUsingStreams {
    public static void main(String[] args) {
        String str = "hello world"; // Input string
        long vowels = str.toLowerCase()
                .chars()                         // Stream of characters
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();                        // Count vowels
        long consonants = str.toLowerCase()
                .chars()
                .filter(ch -> ch >= 'a' && ch <= 'z') // Only letters
                .filter(ch -> "aeiou".indexOf(ch) == -1)
                .count();                               // Count consonants
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
