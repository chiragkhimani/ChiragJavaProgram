package com.java.regex;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        boolean result = Pattern.compile("^[0-9]+$").matcher("08308a32423423").matches();
        System.out.println(result);

        String str = "Price is INR 333 with all discount";
        System.out.println(str.replaceAll(" ",""));
    }
}
