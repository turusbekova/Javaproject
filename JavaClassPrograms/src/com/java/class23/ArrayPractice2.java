package com.java.class23;

import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 8 fruits: ");
        String fruits [] = new String[8];
        for (int i = 0; i < fruits.length; i++ ){
           fruits[i] = scan.next();
        }

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {
                    System.out.println("Duplicates: " + fruits[j]);
                    break;
                }
            }
        }


    }
}
