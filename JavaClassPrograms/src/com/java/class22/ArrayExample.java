package com.java.class22;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // create array and initialize an array
        int listOfData[] = {10, 20, 30, 32, 50, 70, 40};

        // access element from the array

        System.out.println(listOfData[2]);
        System.out.println(listOfData.length);

        System.out.println(Arrays.toString(listOfData));

        for (int i = 0; i < listOfData.length; i++){
            System.out.println(listOfData[i]);
        }
    }
}

