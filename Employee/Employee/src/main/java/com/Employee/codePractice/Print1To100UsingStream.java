package com.Employee.codePractice;

import java.util.stream.IntStream;
public class Print1To100UsingStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)   // Numbers from 1 to 100
                .forEach(i -> System.out.print(i + " "));
    }
}
