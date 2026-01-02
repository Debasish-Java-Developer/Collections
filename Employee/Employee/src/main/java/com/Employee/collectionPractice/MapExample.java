package com.Employee.collectionPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.*;

import java.util.*;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring");
        // map converts each string to uppercase
        List<String> result = names.stream()
                .map(name -> name.toUpperCase()) // one input → one output
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

