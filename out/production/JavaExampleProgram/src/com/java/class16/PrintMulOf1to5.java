package com.java.class16;
// Write a program to print multiplication of 1 to 5
public class PrintMulOf1to5 {
    public static void main(String[] args) {
        int mul = 1;

        for(int i=1; i<=5; i++){
            mul = (mul * i);
        }

        System.out.println(mul);

    }
}
