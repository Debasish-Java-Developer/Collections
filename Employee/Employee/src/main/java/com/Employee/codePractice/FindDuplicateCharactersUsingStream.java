package com.Employee.codePractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharactersUsingStream {
    public static void main(String[] args) {
        String str = "programming"; // Input string
        Set<Character> seen = new HashSet<>(); // Store seen characters
        System.out.println("Duplicate characters:");
        str.chars()                               // Convert string to stream
                .mapToObj(c -> (char) c)               // Convert int to char
                .filter(ch -> !seen.add(ch))           // If already present → duplicate
                .forEach(System.out::println);         // Print duplicates
    }
}
