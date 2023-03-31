package com.java.class38;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();

        // store data into the list
        listOfNumber.add(30);
        listOfNumber.add(40);
        listOfNumber.add(50);
        listOfNumber.add(60);
        listOfNumber.add(2, 39);
//        System.out.println(listOfNumber);

        listOfNumber.remove(3);

        // get data from the list
        for (int i = 0; i < listOfNumber.size(); i++){
            System.out.println(listOfNumber.get(i));
        }

        System.out.println("==========================");

        for (int data : listOfNumber){
            System.out.println(data);
        }


    }
}
