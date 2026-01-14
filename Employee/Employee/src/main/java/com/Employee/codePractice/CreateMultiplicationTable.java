package com.Employee.codePractice;

public class CreateMultiplicationTable {
    public static void main(String[] args) {
        int num = 5; // Number whose table is needed
        for (int i = 1; i <= 10; i++) {          // Loop from 1 to 10
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
