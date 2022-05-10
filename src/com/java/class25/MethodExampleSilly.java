package com.java.class25;

public class MethodExampleSilly {
    public static void main(String[] args) {
        System.out.println(method1(method2(method1(50))));
    }

    static int method1(int num){
        return 10 + num;
    }

    static int method2(int num){
        return method1(20) + num;
    }
}
