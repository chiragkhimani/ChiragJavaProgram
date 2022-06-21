package com.java.class41;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
       // Create object of Map
        Map<String, String> countryCurrencyData = new HashMap<String, String>();

        // Add data into Map
        countryCurrencyData.put("America","USD");
        countryCurrencyData.put("India","INR");
        countryCurrencyData.put("Dubai","Dirham");
        countryCurrencyData.put("Qatar","Riyal");
        countryCurrencyData.put("UK","Pound");
        countryCurrencyData.put("Turkey","Lira");

        // Print Map
        System.out.println(countryCurrencyData);

        // Get value from key
        System.out.println(countryCurrencyData.get("UK"));

        // Find size of Map
        System.out.println(countryCurrencyData.size());

        // Contains key
        System.out.println(countryCurrencyData.containsKey("Japan"));
        System.out.println(countryCurrencyData.containsKey("India"));

        // Traverse the HashMap

        // 1) Print all values of hashmap into console
        Collection<String> values = countryCurrencyData.values();

        for(String str : values){
            System.out.println(str);
        }

        // 2) Print all key value pair of hashmap into console
        System.out.println("============ All Key ==========");
        Set<String> keys = countryCurrencyData.keySet();
        for(String key : keys){
            System.out.println(key+" = "+countryCurrencyData.get(key));
        }

        // 3) Print all key value pair of hashmap using EntrySet
        System.out.println("============ All Key Value ==========");
        Set<Entry<String, String>> pairs = countryCurrencyData.entrySet();

        for(Entry<String, String>  pair:  pairs){
            System.out.println(pair.getKey() + " = "+ pair.getValue());
        }

    }
}
