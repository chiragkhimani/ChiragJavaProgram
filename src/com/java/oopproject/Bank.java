package com.java.oopproject;

import java.util.Random;

public abstract class Bank {

    double balance;
    int accountNumber;

    Bank(){
        accountNumber = new Random().nextInt();
    }

    Bank(int balance){
        accountNumber = new Random().nextInt();
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(amount > balance){
            throw new RuntimeException("First get rich and then place order!!");
        }else {
            balance = balance - amount;
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void viewBalance(){
        System.out.println(balance);
    }

    public void transerMoney(Person targetAccountPerson, double amount){
        targetAccountPerson.getBankAccount().deposit(amount);
        balance = balance - amount;
    }

}

class ChaseBank extends Bank{
    final double RATE_OF_INTEREST = 4.5;
    final int ROUTING_NUMBER  = 32534;

    public void takeLoan(double amount){
        balance = balance + (amount * RATE_OF_INTEREST)/100;
    }
}

class BankOfAmerica extends Bank{

    public void takeInsurance(Person p){
        if(p.age > 60){
            balance = balance * 0.9;
        }else if(p.age > 50){
            balance = balance * 0.95;
        }else if (p.age>40){
            balance = balance * 0.97;
        }else{
            balance = balance * 0.98;
        }
    }
}