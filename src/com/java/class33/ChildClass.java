package com.java.class33;
public class ChildClass extends Parent{
    public void method1(){
        System.out.println("C1");
    }

    public void method2(){
        System.out.println("C2");
    }

    public void method5(){
        System.out.println("C5");
    }

    public void method6(){
        System.out.println("C6");
    }
}

class MainClass{
    public static void main(String[] args) {
        Parent p = new ChildClass();
        p.method1();
        p.method2();
        p.method3();
        p.method4();
    }
}
