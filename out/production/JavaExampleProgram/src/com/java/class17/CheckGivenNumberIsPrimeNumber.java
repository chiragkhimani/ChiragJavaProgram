package com.java.class17;

// Write a program to find out divisor of given number

import java.util.Scanner;

public class CheckGivenNumberIsPrimeNumber {

    public static void main(String[] args) {
        // Take number from user
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }


    }

}
