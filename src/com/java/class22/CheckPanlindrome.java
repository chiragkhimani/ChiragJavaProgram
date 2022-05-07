package com.java.class22;

public class CheckPanlindrome {
    public static void main(String[] args) {

        int num = 13456;
        int rev = 0;
        // Because our num will be zero at the end
        int backUpOfOriginal = num;

        while(num>0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if(backUpOfOriginal == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
