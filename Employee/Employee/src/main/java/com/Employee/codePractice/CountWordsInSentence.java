package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {

        String sentence = "Java is very easy"; // Input sentence
        int count = 0;                         // Word count

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = sentence.trim().split("\\s+");

        // If sentence is not empty, length of array is word count
        if (sentence.trim().length() > 0) {
            count = words.length;
        }

        System.out.println("Word count = " + count);
    }
}
