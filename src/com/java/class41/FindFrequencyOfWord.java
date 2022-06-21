package com.java.class41;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfWord {
    public static void main(String[] args) {
        String str = "The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group. It is the third largest newspaper in India by circulation and largest selling English language daily in the world";

        String[] words = str.split(" ");

        Map<String, Integer> frequency = new HashMap<String, Integer>();

        for(String word : words){
            if(!frequency.containsKey(word)){
                frequency.put(word, 1);
            }else {
                int prevFreq = frequency.get(word);
                frequency.put(word, prevFreq + 1);
            }
        }

        System.out.println(frequency);

    }
}
