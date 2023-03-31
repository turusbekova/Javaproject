package com.java.class09;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your gender M or F?");
        // when you hit . and have a name ending with a ()
        //it means it's a method(function)
        String gender = scan.next();

        // charAt(0)  method takes the first character of String

        char genderB =gender.charAt(0);
        System.out.println(genderB);
//        What is your gender M or F?
//        Female
//        F

        System.out.println("What is your Tesla Model?");
        // when you to get a character from user use a syntax below
        char teslaModel = scan.next().charAt(0);
        System.out.println(teslaModel);


    }
}
