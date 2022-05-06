package com.java.class24;

import java.util.Locale;

public class FindOutFrequencyOfEachWordFromSentence {
    public static void main(String[] args) {
        String str = "This is java class and this class we learn java programs";

        String words[] = str.toLowerCase().split(" ");

        // Output
        // This - 2
        // is - 1
        // java - 2
    }
}
