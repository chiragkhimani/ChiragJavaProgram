package com.java.class32;

class Vehicle{

    Vehicle(int num){
        System.out.println(num);
    }

}

class Car extends Vehicle{

    Car(int num){
        super(num);
        System.out.println(num);
    }
}

public class ThisAndSuperImpQuestion {
    public static void main(String[] args) {
        Car c = new Car(10);
    }
}
