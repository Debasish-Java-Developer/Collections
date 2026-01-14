package com.Employee.codePractice;

import java.util.Map;
import java.util.stream.Collectors;

public class FindAnagramUsingStream {
    public static void main(String[] args) {
        String s1 = "listen"; // First string
        String s2 = "silent"; // Second string
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        // Create frequency map for first string
        Map<Character, Long> map1 =
                s1.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        // Create frequency map for second string
        Map<Character, Long> map2 =
                s2.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        // Compare both maps
        if (map1.equals(map2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
