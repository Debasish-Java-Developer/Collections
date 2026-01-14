package com.Employee.codePractice;

import java.util.stream.IntStream;

public class CountMultiplicationTableUsingStream {
    public static void main(String[] args) {
        int num = 5; // Number whose table is needed
        IntStream.rangeClosed(1, 10)                    // Range from 1 to 10
                .forEach(i ->
                        System.out.println(num + " x " + i + " = " + (num * i))
                );
    }
}
