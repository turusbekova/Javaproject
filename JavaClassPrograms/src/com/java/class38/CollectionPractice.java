package com.java.class38;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        for (int i = 0; i < fruits.size(); i++){
            if (fruits.get(i).contains("Banana")){
                System.out.println(fruits.remove("Mango"));
            }
        }
        System.out.println(fruits);


    }
}
