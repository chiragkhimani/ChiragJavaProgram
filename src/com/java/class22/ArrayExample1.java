package com.java.class22;

public class ArrayExample1 {

    public static void main(String[] args) {

        // Declaration simple int
        int num;

        // Declaration of array
        int listOfNum[];

        // initialization of array
        listOfNum = new int[5];

        // Store data into array
        listOfNum[0] = 20;
        listOfNum[1] = 50;
        listOfNum[2] = 100;
        listOfNum[3] = 40;
        listOfNum[4] = 60;

        // Declaration and initialization of array
        int data[] = {23,42,56,76,52,12};

        // Print all numbers from array
        for(int i=0; i<listOfNum.length; i++) {
            System.out.println(listOfNum[i]);
        }

        // Find length of array
        System.out.println("Length of array"+listOfNum.length);

        // It'll throw ArrayIndexOutOfBound Exception
        System.out.println(listOfNum[5]);

    }

}
