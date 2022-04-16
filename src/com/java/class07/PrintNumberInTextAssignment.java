package com.java.class07;

// Take one number from user (0-9) & print number in text format

// Example input - 1, output - One
// Example input - 7, output - Seven

import java.util.Scanner;

public class PrintNumberInTextAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num==0) {
            System.out.println("Zero");
        }else if(num ==1) {
            System.out.println("One");
        }else if(num ==2) {
            System.out.println("Two");
        }else if(num ==3) {
            System.out.println("Three");
        }else if(num ==4) {
            System.out.println("Four");
        }else if(num ==5) {
            System.out.println("Five");
        }else if(num ==6) {
            System.out.println("Six");
        }else if(num ==7) {
            System.out.println("Seven");
        }else if(num ==8) {
            System.out.println("Eight");
        }else if(num ==9) {
            System.out.println("Nine");
        }else{
            System.out.println("Invalid input, please enter from 0-9 only");
        }

    }
}
