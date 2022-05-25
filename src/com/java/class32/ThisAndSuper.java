package com.java.class32;

class Parent{

    Parent(){
        this(50);
        System.out.println("1");
    }

    Parent(int num){
        System.out.println(num);
    }
}

class Child extends Parent{
    Child(){
        super(10);
        System.out.println("2");
    }

    Child(int num){
        this();
        System.out.println(num);
    }
}

public class ThisAndSuper{
    public static void main(String []args){
        Child c = new Child();
    }
}