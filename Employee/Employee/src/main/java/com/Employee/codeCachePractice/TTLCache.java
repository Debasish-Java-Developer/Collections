package com.Employee.codeCachePractice;

import java.util.*;

public class TTLCache {
    static class CacheItem {
        String value;
        long expiryTime;
        CacheItem(String value, long ttl) {
            this.value = value;
            this.expiryTime = System.currentTimeMillis() + ttl;
        }
    }
    public static void main(String[] args) throws Exception {
        Map<String, CacheItem> cache = new HashMap<>();
        // Store with TTL = 3 seconds
        cache.put("key1", new CacheItem("data", 3000));
        Thread.sleep(4000); // wait
        CacheItem item = cache.get("key1");
        if (item == null || item.expiryTime < System.currentTimeMillis()) {
            System.out.println("Cache expired");
            cache.remove("key1");
        }
    }
}
