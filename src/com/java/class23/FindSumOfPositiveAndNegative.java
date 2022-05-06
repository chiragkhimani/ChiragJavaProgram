package com.java.class23;

// Write a program to print sum of positive
// and negative numbers from an array


public class FindSumOfPositiveAndNegative {


    public static void main(String[] args) {
        int data[] = {5, 8, 2, -4, -13, 3, -7, 12};
        int sumOfPositive = 0;
        int sumOfNegative = 0;

        for (int i=0; i<data.length; i++){
            if(data[i]>0){
                sumOfPositive = sumOfPositive + data[i];
            }else{
                sumOfNegative = sumOfNegative + data[i];
            }
        }

        System.out.println(sumOfPositive);
        System.out.println(sumOfNegative);
    }

}
