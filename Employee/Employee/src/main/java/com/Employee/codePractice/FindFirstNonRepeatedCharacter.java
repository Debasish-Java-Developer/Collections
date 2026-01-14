package com.Employee.codePractice;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss"; // Input string
        int[] freq = new int[256]; // Frequency array for characters
        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++; // Increase count
        }
        // Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeated character = " + str.charAt(i));
                return; // Stop after first match
            }
        }
        System.out.println("No non-repeated character found");
    }
}
