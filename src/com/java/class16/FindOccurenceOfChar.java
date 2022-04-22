package com.java.class16;


// Write a program to take one String from user and print
// occurrence of given char in String

// input - This is my java program!
// output - 3

import java.util.Locale;
import java.util.Scanner;

public class FindOccurenceOfChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char c = ' ';
        int count = 0;

        for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == c){
               count++;
           }
        }

        System.out.println(count);

    }
}
