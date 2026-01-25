package com.Employee.codePractice;

import java.util.*;

public class InterviewTestCode {

    public static int solve(String feedbacks) {

        // Variable to store final score
        int score = 0;

        // Split feedbacks by ';'
        String[] arr = feedbacks.split(";");

        // Loop through each feedback
        for (int i = 0; i < arr.length; i++) {

            // Trim spaces and convert to lowercase
            String feedback = arr[i].trim().toLowerCase();

            // Ignore empty feedbacks
            if (feedback.length() == 0) {
                continue;
            }

            // Update score
            if (feedback.equals("positive")) {
                score++;          // +1
            } else if (feedback.equals("negative")) {
                score--;          // -1
            }
            // neutral adds 0 → do nothing
        }

        // Return final score
        return score;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read input
        String feedbacks = scan.nextLine();

        // Call solve
        int result = solve(feedbacks);

        // Print output
        System.out.println(result);
    }
}
