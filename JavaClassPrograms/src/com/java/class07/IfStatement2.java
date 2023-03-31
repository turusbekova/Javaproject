package com.java.class07;

import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {

        // take age from user
        // write a program that tells me if I'm eligible to drive or no
//        Scanner scan = new Scanner(System.in);
////         int age = 19;
//        System.out.println("Enter your age: ");
//         // print out you are eligible to drive for people older than 16
//        int age1 = scan.nextInt();
//        if (age1 > 16){
//            System.out.println("you are eligible to drive");
//        }
//        else {
//            System.out.println("It's too early for you");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a weather in fahrenheit: ");
        int num = scan.nextInt();

        if (num < 32){
            System.out.println("It's freezing");
        }
        else if (num > 32 && num < 41){
            System.out.println("It's little chilly outside");
        }
        else if (num >= 42 && num < 68){
            System.out.println("It's a good weather outside");
        }
        else if(num >= 68){
            System.out.println("It's amazing outside");
        }
    }
}
