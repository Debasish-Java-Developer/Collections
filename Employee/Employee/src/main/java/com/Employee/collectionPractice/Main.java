package com.Employee.collectionPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyThread extends Thread {
   public void run() {
      System.out.println("Thread is running");
   }

   public static void main(String[] args) {
      MyThread t = new MyThread(); // create thread object
      t.start();                  // start new thread
   }
}