package com.java.class23;

import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 string:");
        String str[] = new String[5];
        int size = str.length;
        for (int i = 0; i < size; i++ ){
            str[i] = scan.next();
        }
        for (int i = 0; i < size; i++ ){
            System.out.println(str[i] + " - " + str[i].length());
        }

        String names [] = new String[5];
        System.out.println("Enter five names");
        for (int i = 0; i < names.length; i++){
            names[i] = scan.next(); // scan names (all names) from user
        } // it will continue while you won't finish write 5 names
        // after the java moves on to the next for loop and fulfills its conditions

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + " " + names[i].length()); // for return a length of names
        }

    }
}
