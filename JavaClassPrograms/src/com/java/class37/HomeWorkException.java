package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkException {
    public static void main(String[] args) {
//        Task 1:
//        Write a program to print the number of days in a given month using If-Else
//        Example
//        Input - 1,  Output - 31 days
//        Input - 2,  Output - 28/29 days
//        Input - 3,  Output - 31 days
//        Input - 4,  Output - 30 days
//        Input - 12, Output - 31 days
//        Input - Any other number - Throw the Exception
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number of month");
        String month = scan.next();

            if (month.equals("1") || month.equals("3") || month.equals("5")
            || month.equals("7") || month.equals("8") || month.equals("10")
            || month.equals("12")){
                System.out.println("31 days");
            }
            else if (month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11")){
                System.out.println("30 days");
            }
            else if(month.equals("2")){
                System.out.println("28 days");
            }
            throw new InputMismatchException("Please enter number between 1-12");
    }
}
