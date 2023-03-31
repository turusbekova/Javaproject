package com.java.class21;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // 1. Input data from user and create a variables
        // int lastDigit = num % 10; --> take a last digit
        // sum = sum + lastDigit; --> 0 = 0 + lastDigit
        // num = num / 10; --> take a number until remainder
        // and this action is repeated
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

        int sum = 0;

        while (num > 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
