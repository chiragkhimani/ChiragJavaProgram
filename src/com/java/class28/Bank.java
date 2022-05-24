package com.java.class28;

public class Bank {

    // Variables of Class
    int balance;
    String accName;

    // Constructor of Class
    Bank(int balanceFromUser, String accNameFromUser){
        balance = balanceFromUser;
        accName = accNameFromUser;
    }

    // Methods of Class
    public void deposit(int amount){
        System.out.println("depositing into "+accName+" "+amount);
        balance = balance + amount;
    }

    public void withdraw(int amount){
        System.out.println("withdrawing from "+accName+" "+amount);
        balance = balance - amount;
    }

    public void showBalance(){
        System.out.println(balance);
    }

}
