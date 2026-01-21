package com.Employee.codePractice;

import java.util.*;
import java.util.stream.*;

public enum Singleton1 {
    INSTANCE;
    public void show() {
        System.out.println("Singleton instance");
    }
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.INSTANCE;
        Singleton1 s2 = Singleton1.INSTANCE;
        s1.show();
        System.out.println(s1 == s2); // true
    }
}
