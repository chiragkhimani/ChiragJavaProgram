package com.java.class39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<String>();

        list1.add(3);
        list1.add(2);
        list1.add(4);

        list2.add("Tomato");
        list2.add("Apple");
        list2.add("Goat Milk");
        list2.add("Coffee");

        list2.remove("Goat Milk");
        list2.remove(0);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list2.contains("Goat Milk"));
        System.out.println(list2.get(0));
        System.out.println(list2.isEmpty());
        System.out.println(list2.size());

        // Convert list into array and print array
        Object[] array =  list2.toArray();
        for(Object str : array){
            System.out.println(str.toString());
        }

        // Print All Data From List - Way 1 : Using Index based for loop
        System.out.println("==== Print data using index based for loop ===========");
        for(int i=0; i<list2.size(); i++){
            System.out.println(list2.get(i));
        }

        // Print All Data From List - Way 2 : Using enhance for loop
        System.out.println("==== Print data using enhance for loop ===========");
        for(String item : list2){
            System.out.println(item);
        }

        // Print All Data From List - Way 3 : Using Iterator
        System.out.println("==== Print data Using Iterator ===========");

        Iterator<String> itr = list2.iterator();

        // itr.hasNext() - check if we have next element
        // itr.next() - get data at current position and move to next position

        while(itr.hasNext()){
            System.out.println(itr.next());
        }












    }
}
