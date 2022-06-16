package com.java.class21;

// Write a program to find sum of each digit of number
public class FindSumOfEachDigitOfNumber {
    public static void main(String[] args) {
        int num = 36436;
        int sum=0;
        int count=0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
            count++;
        }

        System.out.println(sum);

    }
}
