package com.java.class15;

public class IsEmptyMethod {
    public static void main(String[] args) {

        String myStr1 = "Hello World";
        String myStr2 = "";
        System.out.println(myStr1.isEmpty()); // false, because has "Hello World"
        System.out.println(myStr2.isEmpty()); // true, because this string is empty
    }
}
