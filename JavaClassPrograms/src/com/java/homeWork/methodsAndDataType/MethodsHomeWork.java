package com.java.homeWork.methodsAndDataType;

import java.util.Scanner;

public class MethodsHomeWork {
    public static void main(String[] args) {
    //1. create a method that takes a person's height as a double (in meters) and returns their height
        // in feet and inches. Google the formula

        // 2. Create a method that takes a char representing a grade (A,B,C,D or F) and
        // returns a boolean indicating whether the grade is passing or failing.
        // A and B are passing or failing. A and B are passing, C D F are failing

        // 3. Create a method that takes a boolean indicating whether someone is a member
        // of a loyalty program and a double representing the cost of a purchase and
        // returns a double representing the final cost of the purchase after applying a discount.
        // If the customer is a loyalty customer apply 10% discount

        MethodsHomeWork obj = new MethodsHomeWork();

        System.out.println("Home Work --> 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height:");
        double height = scan.nextDouble();
        System.out.println(showFeet(height) + " it is a feet");
        System.out.println(showInches(height) + " it is an inches");

        System.out.println("Home Work --> 2");
        System.out.println("What is your grade?");
        String ball = scan.next();
        System.out.println(yourBall(ball));

        System.out.println("Home Work --> 3");
        System.out.println("Your item is worth: ");
        double item = scan.nextDouble();
        System.out.println("Are you a loyalty customer?\n True/False");
        boolean answer = scan.nextBoolean();
        System.out.println(obj.customer(answer, item));


    }

    public static double showFeet(double height) {
        double feet = height * 3.28084;
        return feet;
    }

    public static double showInches(double height){
        double inches = height * 39.3701;
        return inches;
    }
    public static String yourBall(String ball) {
        if (ball.equalsIgnoreCase("a")) {
            return "\"" + ball + "\"" + " the grade is passing";
        } else if (ball.equalsIgnoreCase("b")) {
            return "\"" + ball + "\"" + " the grade is passing";
        } else {
            if (ball.equalsIgnoreCase("c")) {
                return "\"" + ball + "\"" + " the grade is falling";
            } else if (ball.equalsIgnoreCase("d")) {
                return "\"" + ball + "\"" + " the grade is falling";
            } else if (ball.equalsIgnoreCase("f")) {
                return "\"" + ball + "\"" + " the grade is falling";
            } else {
                return "ERROR";
            }
        }


    }

    public String customer(boolean answer, double item){
        if (answer){
            return "Congratulations! You have a discount 10 %\n" +
                    "and you should pay - " + item * 0.1 + "$";
        }
        else {
           return "You should pay - " + item;
        }

    }














}
