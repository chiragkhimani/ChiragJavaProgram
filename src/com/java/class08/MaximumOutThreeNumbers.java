package com.java.class08;

// Take three number from users and print maximum number out of three numbers

import java.util.Scanner;

public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
        // Input
        System.out.println("Please enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3=sc.nextInt();

        // Output
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest");
        }else if(num2 > num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }

    }
}
