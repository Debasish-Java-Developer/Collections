package com.Employee.codeCachePractice;

import java.util.concurrent.*;

public class ConcurrentCache {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> cache = new ConcurrentHashMap<>();
        cache.put(1, "Data1");
        cache.put(2, "Data2");
        System.out.println(cache.get(1));
    }
}

