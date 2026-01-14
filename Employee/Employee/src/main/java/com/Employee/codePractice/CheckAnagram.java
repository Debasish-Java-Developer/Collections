package com.Employee.codePractice;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "listen";   // First string
        String s2 = "silent";   // Second string
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        // Convert strings to character arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        // Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);
        // Compare sorted arrays
        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
