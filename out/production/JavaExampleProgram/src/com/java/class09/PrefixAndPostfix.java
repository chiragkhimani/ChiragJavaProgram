package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {
        int i = 4;
        int j = 4;

        int k = i++ + --j;

        int m = k++ - i++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
        System.out.println(k);
    }
}
