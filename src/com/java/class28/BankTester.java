package com.java.class28;

public class BankTester {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000, "Mike");
        Bank b2 = new Bank(5000, "Becky");

        b1.deposit(1000);
        b2.deposit(3000);

    }

}
