package com.java.class12;

import java.util.Scanner;

public class MethodsPractice {
    //Create a function that return true or false and will let us know if we can sleepIn.
    //it should take 2 params - one to know if's a weekday
    //another param to know if it's a vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it a weekday?\n true/false");
        boolean weekday = scan.nextBoolean();
        System.out.println("Is it a vacation day? \n true/false");
        boolean vacation = scan.nextBoolean();

        boolean sleep = sleepIn(weekday, vacation);
        System.out.println(sleep + " you can sleep");
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){

        if (weekday == true){
            return true;
        }
        else {
            return false;
        }
    }




}
