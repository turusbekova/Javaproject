package com.java.practice;

import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args) {
        StringBuilder cars [] = new StringBuilder[3];

        cars[0] = new StringBuilder("BMW");
        cars[1] = new StringBuilder("Audi");
        cars[2] = new StringBuilder("Toyota");

        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);

        StringBuilder audi = new StringBuilder(cars[1]);
        cars[2].reverse();
        audi.reverse();
        System.out.println(audi);
        System.out.println(cars[2]);

        System.out.println("==================");
        String [] str = new String[2];
        System.out.println(Arrays.toString(str));

        str[0] = "James";
        str[1] = "Bond";
        System.out.println(Arrays.toString(str));

    }
}
