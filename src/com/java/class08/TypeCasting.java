package com.java.class08;

public class TypeCasting {
    public static void main(String[] args) {
        // Type Conversion - Int to Double
        // Widening type casting
        // Implicit type casting = java will do itself without error
        int a = 10;
        double d = a;
        System.out.println(d);

        // Type Conversion - Double to Int
        // Narrowing type casting
        // Explicit Type Casting = User has to put target data type in bracket
        double dd = 10.9;
        int aa = (int)dd;
        System.out.println(aa);
    }
}
