package com.java.homeWork.loopsHW;

public class StarsHomeWork {
    public static void main(String[] args) {
//        4.  Write a program to print the below pattern
//*
//**
//***
//****
//*****
//        5.  Write a program to print the below pattern
//       *
//     ***
//    *****
//  *******
//*********
//        6.  Write a program to print the below pattern
// *********
//   *******
//    *****
//      ***
//        *

        System.out.println("======Home Work - 4======");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======Home Work - 5======");
        for (int i = 0; i <= 5; i++){
            for (int s = 0; s <= 5 - i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======Home Work - 6======");

        for (int i = 1; i <= 5; i++){
            for (int s = 0; s <= i - 1; s++ ){
                System.out.print(" ");
            }

            for (int j = 11 - i * 2; j >= 1; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
