package com.java.class08;

public class LogicalOperatorsExamples {


    public static void main(String[] args) {
        boolean b1= true, b2=false, b3=true;

        System.out.println(b1 || b2); // true
        System.out.println(b1 && b2); // false
        System.out.println(!b1 || !b2); // true

        System.out.println(b3 || b1 && b2); // true

        System.out.println(b1 && b3 && b2 || b2 || b3 && b1 && b2 || b1);

        System.out.println(b1 && b2 || b2 && b3 || b1 && !b3);

    }


}
