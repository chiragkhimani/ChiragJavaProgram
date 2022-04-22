package com.java.class16;
// Write a program to take one statement from user and find out number of words
// We have inside the statement

// Example input - Hello, This is my first java String program
// Output - 8

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] parts = str.split(" ");
        System.out.println(parts.length);

    }
}
