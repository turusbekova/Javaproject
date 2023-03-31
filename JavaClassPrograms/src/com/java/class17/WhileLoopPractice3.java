package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        //Write a program to check given number is palindrome or not,
//A palindromic number is a number (such as 16461) that remains the same when its digits are reversed

//you can work with String
//54945
//print out if the number is palindrome or not
//Example 1:
//
//Input:  12321
//Output: Palindrome
//
//Example 2:
//
//Input:  843179
//Output: Not Palindrome


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String number = scan.nextLine();
        String reverse = "";
        int i = 0;
        int length = number.length() - 1;
        while (length >= i){
            reverse += number.charAt(length);
            length--;
        }
        if (number.equalsIgnoreCase(reverse)){
            System.out.println("Entered number is palindrome");
        }
        else {
            System.out.println("Entered number isn't palindrome");
        }




    }
}
