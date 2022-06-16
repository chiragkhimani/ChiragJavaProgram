package com.java.class40;

import java.util.HashSet;
import java.util.Set;

public class SetAssignment {
    public static void main(String[] args) {
        String str = "a compulsory contribution to state revenue, levied by the government on workers income and business profits or added to the cost of some goods services and transactions";

        String[] words = str.split(" ");

        Set<String> setOfWords = new HashSet<>();

        // Approach 1
        for(int i=0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    System.out.println(words[i]);
                    break;
                }
            }
        }

        //  Approach 2
        for(String word : words){
            if(setOfWords.add(word)==false){
                System.out.println(word);
            }
        }



    }
}
