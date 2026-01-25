package com.Employee.codePractice;

import java.util.*;

public class ClosestTriangular {

    public static int closestTriangular(int T) {

        int sum = 0;   // stores triangular number
        int i = 1;     // number to add

        // Keep adding numbers until sum exceeds T
        while (sum + i <= T) {
            sum = sum + i;  // add current number
            i++;            // move to next number
        }

        // sum is the closest triangular number <= T
        return sum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read input
        int T = Integer.parseInt(scan.nextLine().trim());

        // Call function
        int result = closestTriangular(T);

        // Print result
        System.out.println(result);
    }
}
