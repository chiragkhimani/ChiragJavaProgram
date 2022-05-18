package com.java.class28;

public class Car {
    String name;
    int year;

    Car(String nameFromUser, int yearFromUser){
        name = nameFromUser;
        year = yearFromUser;
    }

    public void carConfig(){
        System.out.println(name);
        System.out.println(year);
    }
}
