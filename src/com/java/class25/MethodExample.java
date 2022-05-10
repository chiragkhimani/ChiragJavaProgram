package com.java.class25;

import java.util.Scanner;

public class MethodExample {


    public static void main(String[] args) {
        int result  = method2(10,20);
        System.out.println(result);
    }
    static int method2(int num1, int num2){
        return getNumberFromUser() + getNumberFromUser();
    }
    static int method1(int data){
        return data * 10;
    }
    static int getNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        return num;
    }

}
