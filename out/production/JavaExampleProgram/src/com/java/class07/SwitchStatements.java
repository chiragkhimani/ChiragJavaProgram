package com.java.class07;
// Take one number from user (0-9) & print number in text format

import java.util.Scanner;

// Example input - 1, output - One
// Example input - 7, output - Seven
public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Please enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Please etner 0-9");
        }
    }
}
