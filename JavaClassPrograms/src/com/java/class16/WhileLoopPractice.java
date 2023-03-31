package com.java.class16;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
//        Scanner scan  = new Scanner(System.in);
//        System.out.println("Please enter a character:");
//        String smth = scan.next();
//        star(smth);

        System.out.println("--------------");
        String str = "*";
        int iterator = 0;
        while (iterator < 5){
            System.out.println(str);
            str = str.concat("*");
            iterator++;
        }

        System.out.println("--------------------------");
        String str2 = "*";
        while (str2.length() < 5){
            // you must have a statement
            // that updates the value of a variable that
            // is used in boolean expression
            str2 = str2.concat("*");
            System.out.println(str2);
        }

        System.out.println("-----------------------");
        int num = 10;
        while (num >= 0) {
            System.out.println(num);
            num--;
        }

//        System.out.println("----------------");
//        String str3 = "*****";

        // how to print 1 less character in a String? - substring
        // substring(0, str.length() - 4

//        while (str3.length() >= 0){
//            System.out.println(str3);
//            str3 = str3.substring(0, str3.length()-1);
//
//        }

        System.out.println("------------------");
        String str4 = "*****";
        int length = str4.length();
        while (length > 0){
            System.out.println(str4.substring(0,length));
            length--;
        }

        System.out.println("-------------------");
        while (str4.length() > 0){
            System.out.println(str4);
            str4 = str4.substring(0, str4.length() - 1);
        }

        System.out.println("========================");
        // write a program that will return only even numbers until 20
        int num2 = 0;
        while (num2 < 20){
           num2 += 2; // num2++; --> incrementing by 1
            // num2 += 2; --> incrementing by 2
            System.out.println(num2);
        }
        System.out.println("===================");
        int n = 0;
        while (n <= 20){
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }

    }





    public static void star(String smth){
        while (smth.length() < 10){
            smth = smth.concat("*");
            System.out.println(smth);
        }
    }

}
