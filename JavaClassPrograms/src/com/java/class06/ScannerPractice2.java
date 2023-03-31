package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your userName: ");
        String userName = scan.next();
        System.out.println(userName + " this is your userName");
        System.out.println("Enter your password: ");
        String password = scan.next();
        System.out.println(password + " this is your password");

        //  anotherString - has no Functionality except giving us a hint that we need to put another String inside
        boolean logIn = userName.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");
        System.out.println(logIn);



        // == != needs to be used with caution when using for Strings
        // you can use == and =! when only working with constant values
        // when you are taking the values from user == != don't work like want it to

        // for Strings the best way to compare is to use .equals()
        // every String variable has .equals() or equalsIgnoreCase()

        // if you want to compare not equals with Strings
        // !var.equals("something");

        //equalsIgnoreCase() --> a method that compares two strings
        //it will return true regardless og the classes
        // "Askar".equalsIgnoreCase("askar1") -> return true

        //equals() -> will return true only if all characters and their cases match
        // "Askar".equalsIgnoreCase("askar1") -> return false

        //equals() - good for password
        //equalsIgnoreCase() - good for username
    }
}
