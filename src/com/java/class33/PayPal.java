package com.java.class33;

public class PayPal {
    public void viewBalance(Bank b){
        b.showBalance();
    }

    public void viewInterestRate(Bank b){
        b.displayInterestRate();
    }
}

class TestClass{
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        WellsFargo wf = new WellsFargo();

        PayPal pp1 = new PayPal();
        pp1.viewInterestRate(cb);
        pp1.viewInterestRate(wf);
    }
}
