package com.Employee.codePractice;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length;) {
            int count = 1;
            while (i + count < arr.length && arr[i] == arr[i + count]) {
                count++;
            }
            if (count > 1) {
                System.out.println(arr[i] + "=" + count + " ");
            }
            i += count;
        }
    }
}
