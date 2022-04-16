package com.java.class11;

// 1 2 * 4 5 * 7 8 * 10

import java.util.Scanner;

public class InClassExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers we need to print");
        int num = sc.nextInt();

        int i=1;

        while(i<=num){
            if(i%3==0){
                System.out.println("*");
            }else {
                System.out.println(i);
            }
            i++;
        }

    }
}
