package com.java.regex;

import java.util.Scanner;

class NameOfDayFromNumber {
    public static void main(String args[]) {
        // Create object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Take dayOfWeekber from user
        System.out.println("Enter a day Week");
        int dayOfWeek = sc.nextInt();

        if (dayOfWeek == 0) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wed");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Fri");
        } else if (dayOfWeek == 6) {
            System.out.println("Sat");
        } else {
            throw new RuntimeException("Please enter number from 0 to 6 only...");
        }
    }
}
