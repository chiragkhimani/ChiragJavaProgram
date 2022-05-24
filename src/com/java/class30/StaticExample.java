package com.java.class30;

class Car{
     static int staticCount;
     int instanceCount;

    Car(){
        staticCount++;
        instanceCount = staticCount;
    }

    void printCount(){
        System.out.println(instanceCount);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c5 = new Car();

        c2.printCount(); // 2
        c5.printCount(); // 5
    }
}
