package com.java.homeWork.conditionalsHW;

import java.util.Scanner;

public class ConditionalOrHomeWork {
    public static void main(String[] args) {
        // HW

        // Login Functionality
        // Write the project which would tell the user if logged in or  not
        // username
        // password
        // loginLocation

        // in order to be logged your userName should match steve@aplle.com
        //and your password should be infinityLoop1
        //and your location should be california


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();
        System.out.println("Enter your location: ");
        String loginLocation = scan.next();

        boolean logIn = userName.equals("begimai@apple.com") && password.equals("infinityLoop1") && loginLocation.equals("California");
        System.out.println(logIn);




    }
}
