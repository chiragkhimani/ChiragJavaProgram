package com.java.class39;


public class GenericDemo {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>();
        Box<String> b2 = new Box<String>();

        b1.setNum(10);
        b2.setNum("Chirag");

        System.out.println(b1.getNum());
        System.out.println(b2.getNum());
    }
}
