package com.Employee.codePractice;

public class AA {
    public static void main(String[] args) {
        String str = "hello world";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            // Print only duplicates (ignore space)
            if (count > 1 && ch[i] != ' ') {
                System.out.println(ch[i] + " " + count);
            }
        }
    }
}
