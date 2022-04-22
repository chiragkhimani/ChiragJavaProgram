package com.java.class15;

import java.util.Scanner;
// Print Reverse of Given String
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";


        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }
}
