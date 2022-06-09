package com.java.class38;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Write a program when user enter any number from 0 to 6
// print days of week
// 0 - Sunday, 1 - Monday, 2 - Tue,...... 6 - Sat
public class LadderIfElseExample {

    public static void main(String[] args) {
        // Input
        System.out.println("Enter any number from 0 to 6: ");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        if(dayNum==0){
            System.out.println("Sun");
        }else if(dayNum==1){
            System.out.println("Mon");
        }else if(dayNum==2){
            System.out.println("Tues");
        }else if(dayNum==3){
            System.out.println("Wed");
        }else if(dayNum==4){
            System.out.println("Thur");
        }else if(dayNum==5){
            System.out.println("Fri");
        }else if(dayNum==6){
            System.out.println("Sat");
        }else{
                throw new RuntimeException("Please enter from 0 to 6 only");
        }

        System.out.println("Next steps to use dayNum");

    }

}
