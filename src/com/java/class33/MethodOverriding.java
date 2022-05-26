package com.java.class33;

class ChaseBank1 extends Bank1{
    @Override
    public void displayInterestRate(){
        super.displayInterestRate();
        System.out.println("7.0%");
    }
}

class WellsFargo1 extends Bank1{
    // Annotation
    @Override
    public void displayInterestRate(){
        System.out.println("5.0%");
        super.displayInterestRate();
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        ChaseBank1 cb = new ChaseBank1();
        cb.displayInterestRate();

        WellsFargo1 wf = new WellsFargo1();
        wf.displayInterestRate();
    }

}
