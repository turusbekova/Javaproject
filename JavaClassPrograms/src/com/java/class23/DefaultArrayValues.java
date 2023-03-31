package com.java.class23;

import java.util.Arrays;

public class DefaultArrayValues {
    public static void main(String[] args) {
        int listOfData[] = new int[10];
        System.out.println(listOfData[0]);
        System.out.println(Arrays.toString(listOfData));

        // List of Array
        listOfData[0] = 10;
        listOfData[1] = 20;
        listOfData[2] = 30;
        System.out.println(Arrays.toString(listOfData));
        System.out.println(listOfData.length);

        for (int i = 0; i < listOfData.length; i++){
            System.out.println(listOfData[i]);
        }





    }
}
