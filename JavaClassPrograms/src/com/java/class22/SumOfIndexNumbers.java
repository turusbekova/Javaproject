package com.java.class22;

import java.util.Scanner;

public class SumOfIndexNumbers {
    public static void main(String[] args) {
        int num [] = new int[8];
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 8 numbers:");

        //int num2 = 70;
        for (int i = 0; i < num.length; i++){
           num[i] = scan.nextInt();
           sum = sum + num[i];
        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Please enter target a number we need find index");
        int targetNumber = scan.nextInt();

        for (int i = 0; i < num.length; i++){
            if (num[i] == targetNumber){
                System.out.println(i);
            }
        }
    }
}
