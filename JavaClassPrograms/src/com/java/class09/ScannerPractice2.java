package com.java.class09;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        // ask user for their gender in char
        // if the user gender is M then print out -> go work hard
        // if the user gender is F then print out -> enjoy your life
        // wrong input

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your gender M or F?");
        char gender = scan.next().charAt(0);
        if (gender == 'M' || gender == 'm'){
            System.out.println("go work hard");
        }
        else if (gender == 'F' || gender == 'f'){
            System.out.println("enjoy your life");
        }
        else {
            System.out.println("wrong input");
        }
    }
}
