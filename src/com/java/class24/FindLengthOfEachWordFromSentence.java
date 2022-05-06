package com.java.class24;

// Write a program to find length of each word

public class FindLengthOfEachWordFromSentence {
    public static void main(String[] args) {
        String str = "The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group. It is the third largest newspaper in India by circulation and largest selling English language daily in the world.";

        String words[] = str.split(" ");

        for (String word : words) {
            System.out.println(word+" = " + word.length());
        }

        for (int i=0; i<words.length; i++) {
            System.out.println(words[i]+" = " + words[i].length());
        }

    }
}
