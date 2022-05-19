package com.java.class30;

public class InheritanceExample {
    public static void main(String[] args) {
        BasicCalculator basic = new BasicCalculator();
        basic.sum(10,20);
        basic.sub(10,20);

        AdvanceCalculator ac = new AdvanceCalculator();
        ac.sum(10,20);
        ac.mul(10,20);
        ac.sub(10,20);
        ac.div(10,20);
    }
}
