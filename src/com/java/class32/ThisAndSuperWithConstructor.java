package com.java.class32;

class Animal {
    Animal(){
        System.out.println("1");
    }

}

class Dog extends Animal{
    Dog(){
        this("Abc");
        System.out.println("2");
    }

    Dog(String name){
        super();
        System.out.println(name);
        System.out.println("3");
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Dog d = new Dog();

    }
}
