package com.java.class33;

class Bank1{
    int balance;

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void displayInterestRate(){
        System.out.println("6.0%");
    }
}
