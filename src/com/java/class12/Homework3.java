package com.java.class12;

// 3. Write a program to print numbers that are not divisible by 3 and divisible by 7

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        int i = 1;

        while(i<=50){
            if(i%3!=0 && i%7==0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
