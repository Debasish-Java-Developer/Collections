package com.Employee.codePractice;

public class SingletonDemo {
    // static variable to hold single instance
    private static SingletonDemo instance;
    // private constructor so object cannot be created from outside
    private SingletonDemo() {
        System.out.println("Singleton object created");
    }
    public static void main(String[] args) {
        // first time calling getInstance
        SingletonDemo obj1 = getInstance();
        // second time calling getInstance
        SingletonDemo obj2 = getInstance();
        // checking whether both references point to same object
        System.out.println(obj1 == obj2); // true
    }
    // static method to return single instance
    public static SingletonDemo getInstance() {
        // create object only if it does not exist
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance; // return same object every time
    }
}

