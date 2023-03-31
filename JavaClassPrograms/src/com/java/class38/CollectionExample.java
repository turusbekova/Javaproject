package com.java.class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();

        // store data into the list
        listOfNumber.add(30);
        listOfNumber.add(40);
        listOfNumber.add(50);
        listOfNumber.add(60);
        listOfNumber.add(2, 39);

        System.out.println(listOfNumber.contains(40)); // true

//        listOfNumber.clear();
//        System.out.println(listOfNumber);

        Collections.sort(listOfNumber);
        Collections.reverse(listOfNumber);
        System.out.println(listOfNumber);


    }
}
