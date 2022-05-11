package com.java.class25;

import java.util.Scanner;

public class MethodExampleTricky {
    static int method1(){
        return method2();
    }
    static int method2(){
        return getNumberFromUser() * 10;
    }
    public static void main(String[] args) {
        int result = method1();
        System.out.println(result);
    }
    static int method3(){
        return 10;
    }
    static int getNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        return method3();
    }
}
