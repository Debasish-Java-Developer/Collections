package com.Employee.codePractice;

import java.util.Arrays;

public class CountWordsInSentenceUsingStream {
    public static void main(String[] args) {
        String sentence = "Java is very easy"; // Input sentence
        long count = Arrays.stream(sentence.trim().split("\\s+"))
                .filter(word -> !word.isEmpty()) // Safety check
                .count();
        System.out.println("Word count = " + count);
    }
}
