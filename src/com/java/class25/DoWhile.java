package com.java.class25;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter number: ");
            int num = sc.nextInt();

            if (isPrime(num) == true) {
                System.out.println("It's Prime");
            } else {
                System.out.println("It's not prime");
            }
            System.out.println("Do you want to try one more time?");
            choice = sc.next();
        }while(choice.equals("yes"));
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
