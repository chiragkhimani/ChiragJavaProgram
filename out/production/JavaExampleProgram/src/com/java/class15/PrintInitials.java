package com.java.class15;

import java.util.Scanner;

// Take Full Name from user and print initials of it
public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine(); // C.B.K.

        // Input - MyKhailo S Andybur, Output - M.S.A.
        // Input - Liz W Wilcox,       Output - L.W.W.

        String parts[] = fullName.split(" ");

        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0) + "."
                + middleName.charAt(0) + "."
                + lastName.charAt(0) + ".");


    }
}
