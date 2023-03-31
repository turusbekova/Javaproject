package com.java.homeWork.ifelseHW;

import java.util.Scanner;

public class ElseIfStatementHomeWork {
    public static void main(String[] args) {

//        **Write a program to take a day number from the user and print the name of the day from the given number**
//**Question Type:** Write Code.
//## Test Data:
//```java
//        Input - 0,  Output - Sunday
//        Input - 1,  Output - Monday
//        Input - 2,  Output - Tuesday
//        Input - 3,  Output - Wednesday
//        Input - 4,  Output - Thursday
//        Input - 5,  Output - Friday
//        Input - 6,  Output - Saturday
//        Input - 7,  Output - Invalid Input
//```
//
//        Example 2:
//        Welcome to the Beverly Hills
//        Are you traveling first time here(true/false)? false
//        You have got a 10% discount on your stay
//        Enjoy your stay
//```
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the day in number: ");
        int number = scan.nextInt();
        if (number == 1){
            System.out.println("1 it's a Monday");
        }
        else if(number == 2){
            System.out.println("2 it's a Tuesday");
        }
        else if(number == 3){
            System.out.println("3 it's a Wednesday");
        }
        else if(number == 4){
            System.out.println("4 it's a Thursday");
        }
        else if(number == 5){
            System.out.println("5 it's a Friday");
        }
        else if(number == 6){
            System.out.println("6 it's a Saturday");
        }
        else if(number == 7){
            System.out.println("7 it's a Sunday");
        }
        else {
            System.out.println("You should write from 1 to 7");
        }
    }
}
