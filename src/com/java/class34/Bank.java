package com.java.class34;

// Same package class 1
public class Bank{
    int balance;

    public void showBalance(){
        System.out.println(balance);
    }

}

// Same package class 2
class AccessModifierExample {
    int num;

    public void method1(){
        Bank b = new Bank();
        System.out.println(b.balance);
    }
}
