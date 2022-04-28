package com.java.class21;

//
//  1
//  21
//  321
//  4321

public class DemoPattern {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
