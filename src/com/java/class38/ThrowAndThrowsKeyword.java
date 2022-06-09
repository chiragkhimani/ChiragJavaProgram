package com.java.class38;

import java.io.IOException;

public class ThrowAndThrowsKeyword {

    public static void method1() throws IOException {
        int i=1, j=0;
        System.out.println(i / j);
    }

    public static void method2() throws IOException {
        method1();
    }

    public static void method3() throws IOException {
        method2();
    }

    public static void main(String[] args) throws IOException {
        method3();
    }

}
