package com.java.class06;

public class ConditionalOr {
    public static void main(String[] args) {
        // Conditional OR ||
        // is used for setting multiple conditions
        // and overall result is true only if one of them is true

//        int age = 25;
//        boolean giveDiscount = age > 60 || age < 8;
//        System.out.println(giveDiscount);
//
//        // if 24 hr time
//
//        int currentTime = 13;
//        // drink coffee should be true if current time is 6-11
//        boolean drinkCoffee = currentTime > 6 || currentTime < 11;
//        System.out.println(drinkCoffee);
//
//        System.out.println("________________________________");
//
//        int howManyExercises = 4;
//        int howManySoftSkills = 6;
//        boolean canIrelaxNow = howManyExercises >= 5 || howManySoftSkills >= 2;
//        System.out.println(canIrelaxNow);
//
//        System.out.println("_____________________________");

        //Banking industry application
        // when should the bank account be blocked?
        // loginAttempts more than 3
        // transaction amount is more than $3000
        // location of transaction -> must match your current location

        int num = 1;
        int num2 = 1;
        boolean b = num != num2;
        System.out.println(b);


        int numberOfLoginAttempts = 1;
//        double transactionAmount = 1500.0;
        String locationOfTransaction = "KG";

        boolean block = numberOfLoginAttempts > 3 && locationOfTransaction != "USA";
        System.out.println(block);

        // you store text in a String data type
        // you can only compare strings with ==, !=
        // you can not do < > >= <=

        // HW

        // Login Functionality
        // Write the project which would tell the user if logged in or  not
        // username
        // password
        // loginLocation

        // in order to be logged your userName should match steve@aplle.com
        //and your password should be infinityLoop1
        //and your location should be california

//
//        boolean logIn = true;






    }
}
