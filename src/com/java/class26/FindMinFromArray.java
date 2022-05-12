package com.java.class26;

public class FindMinFromArray {
    public static void main(String[] args) {
        int[] data = {20, 10, 12, 60, 40};

        int min = data[0];

        for(int num : data){
            if(num < min){
                min = num;
            }
        }

        System.out.println(min);

    }
}
