package com.java.class28;

public class PersonTester {
    public static void main(String[] args) {
        System.out.println("======No Arg constructor=======");
        Person p = new Person();
        p.printPersonDetails();

        System.out.println("======Setting only name and age=======");
        p = new Person("Chirag", 12);
        p.printPersonDetails();

        System.out.println("======Setting only name and phone=======");
        p = new Person("Chirag", "3454353");
        p.printPersonDetails();

    }
}
