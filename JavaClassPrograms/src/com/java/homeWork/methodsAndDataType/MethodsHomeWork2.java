package com.java.homeWork.methodsAndDataType;

import java.util.Scanner;

public class MethodsHomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = scan.nextInt();
        System.out.println(isALeapYear(year));
    }

        public static boolean isALeapYear(int year){
        if(year % 4 == 0){ // /
            return true;
            }
        else {
            return false;
        }

        }

    }

