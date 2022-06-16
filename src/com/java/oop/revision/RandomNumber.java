package com.java.oop.revision;

import java.util.Random;

public class RandomNumber {
    static int i; // static variable
    int j; // instance variable

    public static void main(String[] args) {
        int k; // local
        Random r = new Random();
        System.out.println(r.nextInt(100));
    }
}
