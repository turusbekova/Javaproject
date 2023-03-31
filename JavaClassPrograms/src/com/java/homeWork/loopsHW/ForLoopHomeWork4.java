package com.java.homeWork.loopsHW;

import java.util.Scanner;

public class ForLoopHomeWork4 {
    public static void main(String[] args) {
        //            4.  Write a program to print the greatest digit from the given number
//    Example1
//    Input - 86545
//    Output - Greatest digit is 8
//    Example2
//    Input - 23561
//    Output - Greatest digit is 6
//            5.  Write a program to print the reverse of the given number
//            Example1
//    Input - 86545
//    Output - 54568
//    Example2
//    Input - 23561
//    Output - 16532

        System.out.println("========Home Work - 4========");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        int max = num % 10;

        while (num > 0){
            int lastDigit = num % 10;
            if (lastDigit > max){
                max = lastDigit;
            }
           num = num / 10;
        }
        System.out.println("The greatest number is " + max);

        System.out.println("========Home Work - 5========");
        System.out.println("Please enter a number: ");
        int num1 = scan.nextInt();
         int rev = 0;
         while (num1 > 0){
             rev = num1 % 10;
             System.out.print(rev);
             num1 = num1 / 10;
         }

    }
}
