package com.java.class12;

public class ForLoopExample {
    public static void main(String[] args) {

        // Print 2 4 6 8 10
        for(int i = 1;  i<=10; ++i){ // condition
            if(i % 2==0) {
                System.out.println(i);  // body
            }
        }

        for(int i = 1;  i<=10/2; ++i){
                System.out.println(i*2);
        }

        for(int i = 2;  i<=10; i=i+2){
            System.out.println(i);
        }


    }
}
