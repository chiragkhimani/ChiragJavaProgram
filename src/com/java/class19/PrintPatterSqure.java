package com.java.class19;

public class PrintPatterSqure {
    public static void main(String[] args) {
        // Print 5 number of rows
        for(int i=1; i<=5; i++){

            // Print 1 to 5 in same line
            for(int j=1; j<=5; j++) {
                if (i % 2 == 0) {
                    System.out.print("&");
                } else{
                    System.out.print("*");
                }
            }

            // Print Enter
            System.out.println();
        }
    }
}
