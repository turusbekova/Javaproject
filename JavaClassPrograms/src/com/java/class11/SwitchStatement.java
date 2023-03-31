package com.java.class11;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
//
//        final int num1 = 6;
//        int rate = num1;
//        switch (rate){
//            case 1:
//                System.out.println("Awful service");
//                break;
//            case num1:
//                System.out.println("Extremely poor service");
//                break;
//            case 3:
//                System.out.println("something");
//        }
//
//        final int num = 10; // constant variable

//        System.out.println("__________________________________________-");
//        int rate = 11;
//        switch (rate){
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Bad Services");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Okay service");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Good service");
//                break;
//            default:
//                System.err.println("INVALID");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number of month:");
        int month = scan.nextInt();

//        switch (month){
//            case 1:
//                System.out.println("January - 31 days");
//                break;
//            case 2:
//                System.out.println("February - 28/29 days");
//                break;
//            case 3:
//                System.out.println("March - 31 days");
//                break;
//            case 4:
//                System.out.println("April - 30 days");
//                break;
//            case 5:
//                System.out.println("May - 31 days");
//                break;
//            case 6:
//                System.out.println("June - 30 days");
//                break;
//            case 7:
//                System.out.println("July - 31 days");
//                break;
//            case 8:
//                System.out.println("August - 31 days");
//                break;
//            case 9:
//                System.out.println("September - 30 days");
//                break;
//            case 10:
//                System.out.println("October - 31 days");
//                break;
//            case 11:
//                System.out.println("November - 30 days");
//                break;
//            case 12:
//                System.out.println("December - 31 days");
//                break;
//            default:
//                System.err.println("INVALID");
//        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.err.println("INVALID");

        }
        }
    }

