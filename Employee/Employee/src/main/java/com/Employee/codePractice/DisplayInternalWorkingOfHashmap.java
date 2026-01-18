package com.Employee.codePractice;

//Write a program to display internal working of hashMap in Java.
import java.util.HashMap;
import java.util.Map;
public class DisplayInternalWorkingOfHashmap {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grapes", 4);

        // Display the HashMap
        System.out.println("HashMap: " + map);

        // Retrieve a value using its key
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Remove a key-value pair
        map.remove("Orange");
        System.out.println("HashMap after removing 'Orange': " + map);

        // Iterate through the HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
