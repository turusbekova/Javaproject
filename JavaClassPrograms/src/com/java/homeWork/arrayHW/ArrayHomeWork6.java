package com.java.homeWork.arrayHW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork6 {
    //        4. Write a program to sort array elements in ascending order using for-each loop
    //        Input: 5 2 8 7 1
    //        Output: 1 2 5 7 8
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num [] = new int[5];

        System.out.println("Please enter numbers:");
        for (int i = 0; i < num.length; i++){
            num[i] = scan.nextInt();
        }
        System.out.println("Before sort array --> " + Arrays.toString(num));

        for (int i = 0; i < num.length; i++){
            Arrays.sort(num);
        }
        System.out.println("After sort array --> " + Arrays.toString(num));
    }
}


