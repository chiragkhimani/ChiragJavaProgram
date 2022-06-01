package com.java.class34;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 10;
        Integer j = i; // Auto boxing
        int k = j; // Auto unboxing

        String s1 = "10", s2="20";

        // Convert String to Int
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        // Convert Int to String
        System.out.println(String.valueOf(j) + i);

        // Convert Int to String
        System.out.println(j.toString() + i);


    }
}
