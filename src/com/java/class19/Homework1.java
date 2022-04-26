package com.java.class19;

public class Homework1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isNumHasMoreThanFiveDivisor(i) == true) {
                System.out.println(i);
            }
        }
    }

    // Method Definition / Method Implementation
    static boolean isNumHasMoreThanFiveDivisor(int num) {
            // 9 --> 1 3 9
        int count=0;

        for(int i=1; i<=num; i++){
            if(num%i==0){
               count++;
            }
        }

        if(count>=5){
            return true;
        }

        return false;
    }

}
