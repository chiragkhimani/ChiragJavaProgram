package com.java.class24;

public class FindTransposeOfMatrix {
    public static void main(String[] args) {
        int data[][]={{100, 13, 3},{-24,-51,-36},{70,28,59}};


        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.print(data[j][i]);
            }
            System.out.println();
        }

    }
}
