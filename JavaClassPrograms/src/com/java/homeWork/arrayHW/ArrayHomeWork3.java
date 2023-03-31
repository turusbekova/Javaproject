package com.java.homeWork.arrayHW;

import java.util.Scanner;

public class ArrayHomeWork3 {
    public static void main(String[] args) {
//        ============ Homework 09 / 02 =================
//        1. Write a program to get two 2D arrays from the user and print the sum of it
//        Input:
//        Array 1
//        1 1 1
//        2 2 2
//        3 3 3
//        Array 2
//        4 4 4
//        2 2 2
//        1 1 1
//
//        Output:
//        5 5 5
//        4 4 4
//        4 4 4
        System.out.println("=======Home Work - 1========");
        Scanner scan = new Scanner(System.in);
        int num1 [][] = new int[3][3];
        int num2 [][] = new int[3][3];

        System.out.println("Array 1:");
        for (int i = 0; i < num1.length; i++){
            System.out.println("Please enter 3 numbers for row: " + (i + 1));
            for (int j = 0; j < num1.length; j++){
                num1[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < num1.length; i++){
            for (int j = 0; j < num1[i].length; j++){
                System.out.print(num1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Array 2:");
        for (int i = 0; i < num2.length; i++){
            System.out.println("Please enter 3 numbers for row: " + (i + 1));
            for (int j = 0; j < num2.length; j++){
                num2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < num2.length; i++){
            for (int j = 0; j < num2[i].length; j++){
                System.out.print(num2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Array 3:");
        for (int i = 0; i < num1.length; i++){
            for (int j = 0; j < num2.length; j++){
                System.out.print(num1[i][j] + num2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
