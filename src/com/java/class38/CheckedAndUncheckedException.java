package com.java.class38;

import java.io.File;
import java.io.FileInputStream;

public class CheckedAndUncheckedException {

    public static void main(String[] args) {
        // Run time exception
        int a = 10, b = 1;
        System.out.println(a / b);

        // Compile time exception
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
