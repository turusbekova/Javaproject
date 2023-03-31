package com.java.homeWork.arrayHW;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork2 {
    public static void main(String[] args) {
//        ============ Homework 07 / 02 =================
//        1. Write a program to get a collection of elements and print it in reverse order
//        Input: 1 2 3 4 5
//        Output: 5 4 3 2 1
//        2.  Write a program to find the duplicate elements from the array (The element should not be repeated in the output ) - Brainstorm to find the logic
//        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//        Output: 45, 65, 85
//        3. Program to print the elements of an array present in the odd position
//        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//        Output: 65, 85, 65, 85
//        4. Write a program to sort array elements in ascending order
//        Input: 5 2 8 7 1
//        Output: 1 2 5 7 8;

        System.out.println("======Home Work-1========");
        Scanner scan =  new Scanner(System.in);
        int num [] = new int[5];
        System.out.println("Please enter numbers:");
       for (int i = 0; i < num.length; i++){
           num[i] = scan.nextInt();
       }

        System.out.println("Reversed numbers: ");
       for (int i = num.length - 1; i >= 0; i--){
           System.out.print(num[i] + " ");
       }
        System.out.println();

        System.out.println("======Home Work-3========");
        System.out.println("Please enter numbers: ");
        int number [] = new int[10];
        for (int i = 0; i < number.length; i++){
           number[i] = scan.nextInt();
        }
        System.out.println("Odd numbers: ");
        for (int i = 1; i < number.length; i++){
                if (number[i] % 2 != 0){
                        System.out.print(number[i] + " ");
                    }
        }
        System.out.println();

        System.out.println("======Home Work-4========");

        System.out.println("Please enter numbers: ");
        int numForSort [] = new int[5];
        for (int i = 0; i < numForSort.length; i++){
            numForSort[i] = scan.nextInt();
        }

        System.out.println("Completely sorted: ");
        for (int i = 0; i < numForSort.length; i++){
            Arrays.sort(numForSort);
            System.out.print(numForSort[i] + " ");
        }
        System.out.println();




        //        System.out.println("======Home Work-2========");
//        System.out.println("Enter a number:");
//        int num1 [] = new int[10];
//        for (int i = 0; i < num1.length; i++){
//            num1[i] = scan.nextInt();
//        }
//        System.out.println();
//
//        System.out.println("Duplicates are: ");
//        for (int i = 0; i < num1.length; i++){
//            for (int j = i + 1 ; j < num1.length; j++){
//                if (num1[i] == num1[j]){
//                    System.out.print(num1[j] + " ");
//                    break;
//                }
//            }
//        }
    }
}
