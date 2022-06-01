package com.java.class31;

class Parent{
    int a = 10; // instance variable
}

class Child extends Parent{
    int a = 20; // instance variable

    public void printData(){
        int a = 50; // local variable
        System.out.println(a); // 50
        System.out.println(this.a); // 20
        System.out.println(super.a); // 10
    }
}

public class ExampleOfThisAndSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.printData();
    }
}
