package com.java.class13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strawberry = "berry";
        String rasBerry = "berry";
        String banana = "fruit";
        String blueBerry = new String("berry");


        if (blueBerry.equals(strawberry)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
