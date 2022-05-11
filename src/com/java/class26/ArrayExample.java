package com.java.class26;

public class ArrayExample {
    public static void main(String[] args) {

        int[] data = {20, 10, 12, 60, 40};

        System.out.println(data[2]);

        // System.out.println(data[5]);

        System.out.println(data.length);

        // Print all numbers from array
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        // Print all numbers from array using for each loop / enhance for loop
        for (int num : data) {
            System.out.println(num);
        }

    }
}
