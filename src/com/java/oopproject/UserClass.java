package com.java.oopproject;

public class UserClass {
    public static void main(String[] args) {
        Person chirag = new Person("chirag",45,'M');
        Person becky = new Person("becky",17,'F');
        Person vlad = new Person("vlad",65,'M');

        ChaseBank chaseBank = new ChaseBank();
        BankOfAmerica boa = new BankOfAmerica();

        chirag.setBank(chaseBank);
        chirag.getBankAccount().deposit(1000);
        chirag.getBankAccount().viewBalance();

        becky.setBank(boa);
        becky.getBankAccount().deposit(50000);
        becky.getBankAccount().viewBalance();

        Item shirt = new Item("Java T shirt", 100);
        Item javaBook = new Item("Head First", 47);

        becky.getBankAccount().transerMoney(chirag,5000);

        chirag.getBankAccount().viewBalance();
        becky.getBankAccount().viewBalance();
    }
}
