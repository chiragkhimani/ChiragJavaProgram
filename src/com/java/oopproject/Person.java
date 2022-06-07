package com.java.oopproject;

public class Person {
    String name;
    int age;
    char gender;
    Bank bankAccount;

    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setBank(Bank bankAccount){
        this.bankAccount = bankAccount;
    }

    public Bank getBankAccount(){
        return bankAccount;
    }

}
