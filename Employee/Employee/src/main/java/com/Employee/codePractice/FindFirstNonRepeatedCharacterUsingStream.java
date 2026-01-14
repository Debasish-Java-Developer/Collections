package com.Employee.codePractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatedCharacterUsingStream {
    public static void main(String[] args) {
        String str = "swiss"; // Input string
        Optional<Character> result =
                str.chars()                               // Convert string to IntStream
                        .mapToObj(c -> (char) c)               // Convert int to Character
                        .collect(
                                LinkedHashMap::new,                // Maintain insertion order
                                (map, ch) -> map.put(ch, map.getOrDefault(ch, 0) + 1),
                                Map::putAll
                        )
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() == 1) // Frequency = 1
                        .map(Map.Entry::getKey)
                        .findFirst();                           // First non-repeated character
        if (result.isPresent()) {
            System.out.println("First non-repeated character = " + result.get());
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}
