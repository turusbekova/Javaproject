package com.java.class38;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Object> fruits = new HashSet<>();

        fruits.add("Potato");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add(1);

//        fruits.add("Potato");
//        fruits.add("Mango");
//        fruits.add("Banana");
//        fruits.add("Apple");
//        [Potato, Apple, Mango, Banana] it doesn't duplicate fruits

        System.out.println(fruits);

        for (Object fruit: fruits){
            System.out.println(fruit);
        }



    }
}
