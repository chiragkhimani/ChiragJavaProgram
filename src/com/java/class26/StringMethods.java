package com.java.class26;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        // ================ Trim ===============

        String str1 = "      Hello! Welcome To Ebay      ";
        String str2 = "Hello! Welcome To Ebay";
        System.out.println(str1.trim());
        System.out.println(str1.trim().equals(str2));

        // ================ Format ===============

        String str3 = "Welcome to %s classes, %s will guide you";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fav programming - ");
        String pl = sc.nextLine();

        System.out.println("Enter your fav mentor - ");
        String mentor = sc.nextLine();

        System.out.println(String.format(str3, pl, mentor));

        // =================== Split =====================
        String str4 = "This is my statement to split";

        String[] words = str4.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        // ======================================
        System.out.println(str4.charAt(12));

        String str5 = "";
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());

        // =============Sub String==================
        String str6 = "This is java classes";

        System.out.println(str6.substring(5));
        //      "unhappy".substring(2) returns "happy"
        //      "Harbison".substring(3) returns "bison"
        //      "emptiness".substring(9) returns "" (an empty string)

        System.out.println(str6.substring(5, 9));

        //        "hamburger".substring(4, 8) returns "urge"
        //        "smiles".substring(1, 5) returns "mile"

        System.out.println(str6.replace("Java" , "Python"));

        //        "hamburger".substring(4, 8) returns "urge"
        //        "smiles".substring(1, 5) returns "mile"

    }
}
