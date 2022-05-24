package com.java.class29;

import java.util.Scanner;

public class ExampleToUnderstandStatic {

    int a;

    public static void main(String[] args) {
        int a = 10, b = 20;

         int c = a;
         a = b;
         b = c;

        System.out.println(a); // value of b
        System.out.println(b); // value of a
    }
}
