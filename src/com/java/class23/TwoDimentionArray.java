package com.java.class23;

public class TwoDimentionArray {
    public static void main(String[] args) {
        // Declaration and initialization of array
        int data[][] = new int[3][3];

        //  Declaration and initialization of array
        int nums[][] = {{1, 2, 3}, {5, 4, 2}, {5, 7, 1}, {4, 2, 1}};

        // Find number of rows
        System.out.println(nums.length); // 4

        // Find number of data in each row
        System.out.println(nums[0].length); // 3

        // Print all data from nums
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        // Print all data using enhance for loop
        for( int[] rows : nums){
            for(int d : rows){
                System.out.print(d);
            }
            System.out.println();
        }

    }
}
