package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter the month in number");
//        int month = scan.nextInt();
//        System.out.println("Input: " + month);
//        if (month == 1){
//            System.out.println("January: " + 30);
//        }
//        else if (month == 2){
//            System.out.println("February: " + 28);
//        }
//        else if (month == 3){
//            System.out.println("March: " + 31);
//        }
//        else if (month == 4){
//            System.out.println("April: " + 30);
//        }
//        else if (month == 5){
//            System.out.println("May: " + 31);
//        }
//        else if (month == 6){
//            System.out.println("June: " + 30);
//        }
//        else if (month == 7){
//            System.out.println("July: " + 31);
//        }
//        else if (month == 8){
//            System.out.println("August: " + 31);
//        }
//        else if (month == 9){
//            System.out.println("September: " + 30);
//        }
//        else if (month == 10){
//            System.out.println("October: " + 31);
//        }
//        else if (month == 11){
//            System.out.println("November: " + 30);
//        }
//        else if (month == 12){
//            System.out.println("December: " + 31);
//        }
//        else{
//            System.out.println("Try again");
//        }

        System.out.println("Please enter the month in number: ");
        int month = scan.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("31 days");
        }
        else if (month == 4 || month == 6 ||  month == 9 || month == 11){
            System.out.println("30 days");
        }
        else if (month == 3){
            System.out.println("28 days");
        }
        else {
            System.out.println("Try again");
        }
    }
}
