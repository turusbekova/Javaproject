package com.java.homeWork.ifelseHW;

import java.util.Scanner;

public class IfElseHomeWork3 {
    public static void main(String[] args) {
//        3. Write a program to print a welcome message to the passenger and
//        notify them to do security checks if they are not coming from connecting flight,
//                and at the end print "enjoy your flight"
//        Example 1:
//        Welcome to the Delta Air Lines
//        Are you travelling from connecting flight(true/false)? true
//        Enjoy your flight
//        Example 2:
//        Welcome to the Delta Air Lines
//        Are you travelling from connecting flight(true/false)? false
//        Please proceed to the security check
//        Enjoy your flight

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Delta Air Lines");
        System.out.println("Are you travelling from connecting flight(true/false)?");
        boolean answer = scan.nextBoolean();
        System.out.println("Your answer is:  " + answer);

        if (answer == true){
            System.out.println("Enjoy your flight");
        }
        else if(answer == false){
            System.out.println("Please proceed to the security check");
            System.out.println("Enjoy your flight");
        }
    }
}
