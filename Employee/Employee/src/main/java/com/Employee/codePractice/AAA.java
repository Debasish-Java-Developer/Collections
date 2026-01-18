package com.Employee.codePractice;

import java.util.stream.Collectors;

public class AAA {
    public static void main(String[] args) {

        String str = "Debasish";

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1 && e.getKey() != ' ')
                .forEach(e ->
                        System.out.println(e.getKey() + " " + e.getValue())
                );
    }
}
