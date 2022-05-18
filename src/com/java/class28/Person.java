package com.java.class28;

public class Person {
    String name;
    int age;
    String phoneNumber;

    Person(String nameFromUser, int ageFromUser){
        name = nameFromUser;
        age = ageFromUser;
    }

    Person(String nameFromUser, String phoneNumberFromUser){
        name = nameFromUser;
        phoneNumber = phoneNumberFromUser;
    }

    Person(){
        name = "mike";
        age = 10;
    }

    public void printPersonDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
    }


}
