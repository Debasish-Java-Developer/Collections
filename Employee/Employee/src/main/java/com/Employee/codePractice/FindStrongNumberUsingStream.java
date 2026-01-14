package com.Employee.codePractice;

public class FindStrongNumberUsingStream {
    public static void main(String[] args) {
        int num = 145; // Number to check
        String str = String.valueOf(num); // Convert number to String
        int sum = str.chars()                   // Create stream of characters
                .map(c -> c - '0')         // Convert char to digit
                .map(d -> {                // Find factorial
                    int fact = 1;
                    for (int i = 1; i <= d; i++) {
                        fact = fact * i;
                    }
                    return fact;
                })
                .sum();                    // Sum all factorials
        if (sum == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
