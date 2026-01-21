package com.Employee.hackathonPracticeCode;

import java.util.*;
import java.util.regex.*;

class AdditionMagic {

    // 1. double + String
    public String add(double a, String b) {
        return "T" + b;
    }

    // 2. double + double (rounded to 2 decimal places)
    public String add(double a, double b) {
        double sum = a + b;
        return String.format("%.2f", sum);
    }

    // 3. String + String
    public String add(String a, String b) {
        return a + b;
    }
}

public class Solution {

    private static final Pattern DOUBLE_PATTERN = Pattern.compile(
            "[\\x00-\\x20]*[+-]?(" +
                    "NaN|Infinity|" +
                    "((\\p{Digit}+)(\\.)?(\\p{Digit}*)|" +
                    "(\\.)(\\p{Digit}+))" +
                    "([eE][+-]?(\\p{Digit}+))?" +
                    "|0[xX](\\p{XDigit}+)(\\.)?" +
                    "|0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)" +
                    "([pP][+-]?(\\p{Digit}+))" +
                    ")[fFdD]?[\\x00-\\x20]*");


    public static boolean isFloat(String s) {
        return DOUBLE_PATTERN.matcher(s).matches();
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        AdditionMagic additionMagic = new AdditionMagic();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] temp = line.split(" ");

            boolean firstDouble = isFloat(temp[0]);
            boolean secondDouble = isFloat(temp[1]);

            if (firstDouble && secondDouble) {
                System.out.println(
                        additionMagic.add(
                                Double.parseDouble(temp[0]),
                                Double.parseDouble(temp[1])
                        )
                );
            } else if (firstDouble) {
                System.out.println(
                        additionMagic.add(
                                Double.parseDouble(temp[0]),
                                temp[1]
                        )
                );
            } else {
                System.out.println(
                        additionMagic.add(temp[0], temp[1])
                );
            }
        }
    }
}
