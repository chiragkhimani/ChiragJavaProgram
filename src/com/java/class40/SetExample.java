package com.java.class40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> listOfItems = new HashSet<String>();

        System.out.println(listOfItems.add("Chirag"));
        System.out.println(listOfItems.add("Alex"));
        System.out.println(listOfItems.add("Ayida"));
        System.out.println(listOfItems.add("Rahim"));
        System.out.println(listOfItems.add("Liz"));
        System.out.println(listOfItems.add("Becky"));
        System.out.println(listOfItems.add("Becky"));
        System.out.println(listOfItems.add("Becky"));
        System.out.println(listOfItems.add("Chirag"));
        System.out.println(listOfItems.add("Chirag"));
        System.out.println(listOfItems.add("Rahim"));

        System.out.println(listOfItems);
    }
}
