package com.java.class33;

public class Bank {

    int balance;

    public void showBalance(){
        System.out.println(balance);
    }
    public void displayInterestRate(){
        System.out.println("6.0");
    }
}

class ChaseBank extends Bank{
    public void displayInterestRate(){
        System.out.println("5.0");
    }
}

class WellsFargo extends Bank{
    public void displayInterestRate(){
        System.out.println("7.0");
    }
}
