package com.java.homeWork.ifelseHW;

import java.util.Scanner;

public class ElseIfHomeWork2 {
    public static void main(String[] args) {
//        homework 2:
//> **Write a program to print a welcome message to
//the traveler and notify them of a 10% discount if
// they are returning customers, at the end print
// the message “Enjoy your stay here”**
//>
//**Question Type:** Write Code.
//## Test Data:
//```java
//        Example 1:
//        Welcome to the Beverly Hills
//        Are you traveling first time here(true/false)? true
//        Enjoy your stay
//```
//```java
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Beverly Hills");
        System.out.println("Are you traveling first time here?");
        String answer = scan.nextLine();
        if (answer.equals("Yes! This is the first time I've been here.")){
            System.out.println("Enjoy your stay! \n Is there anything else I can do for you?");
        }
        else if (answer.equals("I often stay here")){
            System.out.println("Wow, thanks that you trust us! \n we have a 10% discount if you are our returning customers");
            System.out.println("Enjoy your stay!");
        }
        else {
            System.out.println("How can I help you?");
        }
    }
}
