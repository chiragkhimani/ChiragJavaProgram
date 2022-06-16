package com.java.class22;

public class ArrayDefaultValue {
    public static void main(String[] args) {
        // By default, array elements are initialized with zero
//        int data[] = new int[5];

        int data1[] = {10,20,30,40,50};

//        System.out.println(data[0]);
//
//        System.out.println(args[0]);
////        System.out.println(args[1]);


        for(int i=0; i<data1.length;i++)
        {
            System.out.println(data1[i]);
        }

        for(int i=data1.length -1; i>=0;i--)
        {
            System.out.println(data1[i]);
        }
    }
}
