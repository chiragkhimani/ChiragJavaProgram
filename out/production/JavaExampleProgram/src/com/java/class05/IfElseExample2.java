package com.java.class05;

import java.util.Scanner;

// Write a program to check given number is odd or even
public class IfElseExample2 {

    public static void main(String[] args) {
        System.out.println("Enter any number - ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2  == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
