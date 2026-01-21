package com.Employee.codeCachePractice;

import java.util.*;

public class SimpleCache {
    public static void main(String[] args) {
        Map<Integer, String> cache = new HashMap<>();
        // Put data
        cache.put(1, "User1");
        cache.put(2, "User2");
        // Get data
        System.out.println(cache.get(1));
        // Remove data
        cache.remove(2);
    }
}
