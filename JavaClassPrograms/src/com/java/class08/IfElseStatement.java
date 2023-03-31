package com.java.class08;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        // first goal is to make sure the program works fine for the customers
        // second goal is to make sure the program is written in a most
        // space(memory) and performance (speed) efficient way
        Scanner scan = new Scanner(System.in);
        System.out.println("Have you a driver license?");
        boolean doesHaveLicense = scan.nextBoolean();
        // the program checks this if statement
        if (doesHaveLicense == true){
            System.out.println("Have a Safe Trip");
        }
        // regardless of the result of the first of statement
        // the program will come and check this statement as well
        // so the program actually spends time for this if statement

        // the program will check if statement
        // if it's true it's execute the if statement
        // if it's false the program jumps to else and execute the body of else, the program
        //doesn't have to check else (there is even no logic)
        else{
            System.out.println("Here is your ticket");
        }
        // if the user has a license and their speed is less than 80 m/hr

        boolean hasLicense = true;
        int speed = 70;
         if (hasLicense && speed < 80){
             System.out.println("have a safe journey");
             System.out.println("Be careful it's snowing today");
         }
         // is there anything you want the program to do
         // if the if statement above is false
         // if yes then add an else statement
         else {
             System.out.println("give a ticket 2");
             System.out.println("Please obey the rules");
         }

    }
}
