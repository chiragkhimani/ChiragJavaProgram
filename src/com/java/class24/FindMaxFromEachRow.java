package com.java.class24;

public class FindMaxFromEachRow {
    public static void main(String[] args) {
        int data[][] = {{-100, -13, -3}, {-24, -51, -36}, {70, 28, 59}};


        for (int i = 0; i < data.length; i++) {
            // initialize first number from each row as max
            int max = data[i][0];

            //In this for loop check if we have any number
            // which is greater than our max number
            for(int j=0; j<data[i].length; j++){
                if(data[i][j] > max){
                    max = data[i][j];
                }
            }

            // print max from each row
            System.out.println(max);
        }
    }
}
