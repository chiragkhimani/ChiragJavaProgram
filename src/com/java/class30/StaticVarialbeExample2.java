package com.java.class30;


class Animal{
    static int count;

    Animal(int i){
        count = i;
    }
}

public class StaticVarialbeExample2 {
    public static void main(String[] args) {
        Animal a1 = new Animal(1);
        Animal a2 = new Animal(2);
        Animal a3 = new Animal(3);
        Animal a4 = new Animal(4);
        Animal a5 = new Animal(5);

        System.out.println(Animal.count);
    }
}
