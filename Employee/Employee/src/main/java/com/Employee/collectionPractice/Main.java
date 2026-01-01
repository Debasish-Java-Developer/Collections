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

public class Main{
    public static void main(String[] args) throws Exception {
        Callable <Integer> task = () -> {
            return 10 + 123;
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future <Integer> future = service.submit(task);
        System.out.println(future.get());
        service.shutdown();
    }
}
