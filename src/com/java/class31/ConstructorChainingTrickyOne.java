package com.java.class31;

class A{
    A(){
        System.out.println("1");
    }
    void A(){
        System.out.println("4");
    }
}
class B extends A{
    B(){
        System.out.println("2");
    }
    void A(){
        super.A();
        System.out.println("5");
    }
}
class C extends B{

    C(){
        System.out.println("3");
    }
    void A(){
        super.A();
        System.out.println("6");
    }
}
public class ConstructorChainingTrickyOne{
    public static void main(String []args){
        C b = new C();
        b.A();
    }
}
