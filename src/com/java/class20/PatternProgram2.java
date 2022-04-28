package com.java.class20;

//        98765
//        9876
//        987
//        98
//        9


public class PatternProgram2 {
    public static void main(String[] args) {

        for(int i=1; i<=3; i++){ // 3 rows

            for(int j=i; j<=i+1; j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
