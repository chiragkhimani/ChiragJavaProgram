package com.java.class06;

// Nested condition / nested if else

// Write a program to print eligibility for the blood donation based on
// age and weight. Age should be >= 18 and weight >=50

import java.util.Scanner;

public class BloodDonationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.println("Enter your age");
        int age= sc.nextInt();

        System.out.println("Enter your weight");
        int weight=sc.nextInt();

        if(age < 18) {
            if(weight>=50) {
                System.out.println("You're eligible");
            }else{
                System.out.println("You're under weight");
            }
        }else{
            if(weight>50){
                System.out.println("You're too young");
            }else{
                System.out.println("You're totally not eligible");
            }
        }



    }
}
