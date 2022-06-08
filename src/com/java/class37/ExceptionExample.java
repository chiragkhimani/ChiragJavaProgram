package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        int num[] = {32,54,21,62,34};
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);

        }catch(InputMismatchException e){
            System.out.println("1. Please try after hangover");
        }catch(ArithmeticException e){
            System.out.println("2. Please study maths that you cannot divide with zero");
        }

        try{
            System.out.println(num[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("3. Everything goes well but your luck not");
        }

        System.out.println("4.This is end of program");


    }

}
