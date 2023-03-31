package com.java.homeWork.enumHW;

//=========Homework 09 March ===========
//        Create an enum of days ( Sunday(0) to Saturday(6) ) and attached an int number to it (0 to 6)
//        Take a day number from the user from 0 to 6
//        Print associate day in the output

import java.util.Scanner;

enum WeekDays{
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    int days;

    WeekDays(int days){
        this.days = days;
    }
}

public class EnumHomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 6");
        int num = scan.nextInt();

        if (num >= 0 && num <= 6){
            System.out.println("The day of number " + num + " is " + WeekDays.values()[num]);
        }
        else {
            System.err.println("Please try again");
        }
    }
}
