package com.java.class23;

// Write a program to find Second Max from an Array
public class FindSecondMaxFromArray {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 33, 75, 67, 0, -100};

        int max = data[0];
        int secondMax = data[0];

        for(int i=0; i<data.length; i++){
            if(data[i] > max){
                max = data[i];
            }else if(data[i] > secondMax){
                secondMax = data[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);

    }

}
