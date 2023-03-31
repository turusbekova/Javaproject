package com.java.class15;

public class StartWithAndEndWithMethods {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println("startWith() Method");
        System.out.println(myStr.startsWith("Hel")); // true
        System.out.println(myStr.startsWith("llo")); // false
        System.out.println(myStr.startsWith("He"));  // true

        System.out.println("endsWith() method");
        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true


    }
}
