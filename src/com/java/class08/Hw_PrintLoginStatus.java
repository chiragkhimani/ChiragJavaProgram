package com.java.class08;

// Write a program to take username and password from user and print appropriate message
//        based on below conditions
//        1. If username correct and password correct ---> Login successful
//        2. If username correct and password incorrect --> Invalid password
//        3. If username incorrect and password correct --> Invalid username
//        2. If username incorrect and password incorrect --> Login unsuccessful

import java.util.Scanner;

public class Hw_PrintLoginStatus {

    public static void main(String[] args) {
        // Input
        System.out.println("Please enter username & password: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();

        String expUsername = "Devx", expPassword = "Sprint2022";

        // Approach 1
        if (username == expUsername && password == expPassword) {
            System.out.println("Login Successful");
        } else if (username != expUsername && password != expPassword) {
            System.out.println("Login Unsuccessful");
        } else if (username != expUsername && password == expPassword) {
            System.out.println("Invalid username");
        } else {
            System.out.println("invalid password");
        }

        // Approach 2
        if (username == expUsername) {
            if (password == expPassword) {
                System.out.println("Login Successful");
            } else {
                System.out.println("invalid password");
            }
        } else if (password == expPassword) {
            System.out.println("invalid username");
        } else {
            System.out.println("Login Unsuccessful");
        }

        // Approach 3
//        if (username == expUsername) {
//            if (password == expPassword) {
//                System.out.println("Login Successful");
//            } else {
//                System.out.println("invalid password");
//            }
//        } else {
//            if (password == expPassword) {
//                System.out.println("invalid username");
//            } else {
//                System.out.println("Login Unsuccessful");
//            }
//        }
//    }

}


}
