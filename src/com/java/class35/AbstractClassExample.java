package com.java.class35;

abstract class Bank{
    int balance;

    Bank(){
        balance = 1000;
    }

    public abstract void displayRateOfInterest();

    public void deposit(int amount){
        balance = balance + amount;
    }
}

class ChaseBank extends Bank{
    public void displayRateOfInterest(){
        System.out.println("0.01%");
    }
}

class CitiBank extends Bank{
    public void displayRateOfInterest(){
        System.out.println("0.06%");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

    }
}
