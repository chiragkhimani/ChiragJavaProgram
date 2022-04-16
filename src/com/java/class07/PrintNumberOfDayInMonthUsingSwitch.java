package com.java.class07;

// Take Month name from User and print number of
// days in given month

import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter a month : ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month) {
            case "January":
            case "january":
            case "May":
            case "may":
            case "March":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28/29");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30");
                break;

            default:
                System.out.println("Please enter a month");
        }


    }
}
