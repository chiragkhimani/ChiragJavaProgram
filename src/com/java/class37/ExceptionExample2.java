package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

    public static void main(String[] args) {
        int num[] = {32,54,21,62,34};
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
            System.out.println(num[5]);
        }catch(InputMismatchException e){
            System.out.println("1. Please try after hangover");
        }catch(ArithmeticException e){
            System.out.println("2. Please study maths that you cannot divide with zero");
        }catch(Exception e){
            System.out.println("Something went wrong! Please try after sometime");
        }

        System.out.println("4.This is end of program");


    }

}
