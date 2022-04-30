package com.java.class14;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to Devx!";

        // 1. Check equality of two String
        System.out.println("1. Equality: " + str1.equals(str2));
        System.out.println("===========================================");

        // 2. Check equality of two String ignoring case
        System.out.println("2. Equality ignoring case: " + str1.equalsIgnoreCase(str2));
        System.out.println("===========================================");

        // 3. Check one String contains another String
        // Contains will check one string contains another string considering case-sensitive
        System.out.println("3. Contains: " + str3.contains(str1));

        // If we want check one String contains another String ignoring case then we have to change
        // both String in same case and then check contains, so it'll check only content of both String
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        System.out.println("3.1 Contains: " + str3LowerCase.contains(str2LowerCase));
        System.out.println("===========================================");

        // 4. Changing the case of String
        System.out.println("4. Upper Case: " + str3.toUpperCase());
        System.out.println("4. Lower Case: " + str3.toLowerCase());
        System.out.println("===========================================");

        // 5. Find index of charter
        str1 = "Hello World";
        str3 = "Hello World! Welcome to Devx!";
        System.out.println("5. Index Of Char: " + str1.indexOf('l'));
        System.out.println("5. Last Index Of Char: " + str3.lastIndexOf('l'));
        System.out.println("===========================================");


        // 6. Find character at index
        str1 = "Hello World";
        System.out.println("6. Char at Index: " + str1.charAt(0));
        System.out.println("===========================================");

        // 7. Length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to Devx!";
        System.out.println("7. Length Of String: " + str1.length());
        System.out.println("7. Length Of String: " + str3.length());
        System.out.println("===========================================");

        // 8. Empty and Blank
        str1 = "                ";
        str3 = "";
        System.out.println("8. Empty: " + str1.isEmpty());
        System.out.println("8. Empty: " + str3.isEmpty());
       // System.out.println("8. Blank: " + str1.isBlank());
        //System.out.println("8. Blank: " + str3.isBlank());
        System.out.println("===========================================");

        // 9. Replace & ReplaceAll
        str1 = "PRICE IS INR 200 INR 300 INR 500";
        System.out.println("9. Replace: " + str1.replace("INR", "USD"));
        System.out.println("9. Replace: "+str1.replaceAll("[a-zA-Z]",""));
        System.out.println("===========================================");

        // 10. Format
        str1 = "Welcome %s, Welcome to %s";
        System.out.println("10. Format: " + String.format(str1, "Chirag", "Ebay"));
        System.out.println("===========================================");

        // 11. SubString
        str1 = "Welcome to java class. Today is fun day";
        System.out.println("11. SubString: " + str1.substring(7));
        System.out.println("11. SubString: " + str1.substring(0,7));
        System.out.println("===========================================");

        // 12. Split
        str1 = "Welcome to java class";
        String[] words = str1.split(" ");
        System.out.println("12. Split: ");
        // Find length of String
        System.out.println(str1.length());

        for(int i=0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("===========================================");
        // 13. Trim
        str1 = "        java class      ";
        System.out.println("13. Trim "+str1.trim());
    }
}
