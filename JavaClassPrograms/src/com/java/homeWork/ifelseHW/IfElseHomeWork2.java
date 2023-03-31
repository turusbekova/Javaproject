package com.java.homeWork.ifelseHW;

import java.util.Scanner;

public class IfElseHomeWork2 {
    public static void main(String[] args) {
//        2. Write a Java program that takes three positive integer numbers from the
//        user as input to calculate and output the average of those three numbers.
//                ex:
//        Input 1: 5
//        Input 2: 10
//        Input 3: 15
//        Output: 10
//        Input 1: 23
//        Input 2: 24
//        Input 3: 25
//        Output: 24

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        System.out.println("Input 1: " + num1);
        int num2 = scan.nextInt();
        System.out.println("Input 2: " + num2);
        int num3 = scan.nextInt();
        System.out.println("Input 3: " + num3);

        int output = (num1 + num2 + num3) / 3;
        System.out.println("Output: " + output);
    }
}
