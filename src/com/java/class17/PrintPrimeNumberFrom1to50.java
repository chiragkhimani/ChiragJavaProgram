package com.java.class17;

import java.util.Scanner;

// Print all prime numbers from 1 to 50
public class PrintPrimeNumberFrom1to50 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            for(int i=1; i<=num; i++){
                if(isPrime(i)==true) {
                    System.out.println(i);
                }
            }

    }

   static boolean isPrime(int num){
       int count = 0;

       for (int i = 1; i <= num; i++) {
           if (num % i == 0) {
               count++;
           }
       }

       if (count == 2) {
           return true;
       } else {
           return false;
       }
    }
}
