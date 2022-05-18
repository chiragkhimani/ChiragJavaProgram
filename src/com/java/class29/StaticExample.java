package com.java.class29;

class Car{
    String color;
    static int carNum;
}

public class StaticExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.color = "White";
        c2.color = "Black";
        c1.carNum = 50;
        c2.carNum = 10;

        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println(c1.carNum);
        System.out.println(c2.carNum);

    }
}
