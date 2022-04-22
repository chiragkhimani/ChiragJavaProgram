package com.java.class17;

// Write a program to find out divisor of given number

import java.util.Scanner;

public class PrimeNumberUsingBoolean {

    public static void main(String[] args) {
        // Take number from user
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            System.out.println("We are dividing "+num+" with "+i);
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime==true){
            System.out.println("Prime number");
        }else{
            System.out.println("It's not prime");
        }



    }

}
