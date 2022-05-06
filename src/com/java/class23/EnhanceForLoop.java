package com.java.class23;

// For Each - Special for loop works with collections of data to
// iterate or traverse or visit each element of an array

public class EnhanceForLoop {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 75, 67, 0, -100};
        int sum = 0;

        for (int num : data) {
             sum = sum + num;
        }

        System.out.println(sum);
    }
}
