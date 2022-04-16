package com.java.class12;

// Print only odd numbers 9  7  5  3  1 using for loop

public class Print10to1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
