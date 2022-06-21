package com.java.class08;
// Take single char in the program & check weather given char is vowel or not
// Vowel char are - a, e, i, o, u
public class CheckCharIsVowel {
    public static void main(String[] args) {
        char c = 'd';

        if(c == 'a' || c=='e' || c=='u' || c=='o' || c=='i'){
            System.out.println("Vowel");
        }else{
            System.out.println("Not Vowel");
        }
    }
}
