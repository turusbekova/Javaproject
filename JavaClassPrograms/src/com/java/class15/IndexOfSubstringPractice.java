package com.java.class15;

public class IndexOfSubstringPractice {
    public static void main(String[] args) {
        String str = "I love 5am waking up at";
        int indexOf = str.indexOf("5am");
        System.out.println(str.substring(indexOf));

        int length = "5am".length();
        System.out.println(indexOf);
        System.out.println(length);
        System.out.println(length + indexOf                                                               );



    }
}
