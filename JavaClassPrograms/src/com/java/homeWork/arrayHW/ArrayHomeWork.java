package com.java.homeWork.arrayHW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork {
    public static void main(String[] args) {
//        ===================== Homework 06 / 02=========================
//        1.  Write a program to find the greatest number from an array
//                Example
//        Input - 12, 45, 67, 23, 13, 45, 56
//        Output - 67
//        2.  Write a program to find the sum of even and odd numbers
//        Example
//        Input - 12, 45, 67, 23, 13, 45, 56
//        Output - Sum of Even Elements - 68, Sum of Odd Elements - 193
//        3.  Write a program to count number of positive(consider zero also positive) and negative numbers from an array
//        Example
//        Input - 12, -45, 67, 23, -13, 45, -56
//        Output - Positive Elements - 4, Negative Elements - 3


        System.out.println("======Home Work-1======");

        int data [] = {10, 4, 29, 34, 19, 40};
        int size = data.length;

        Arrays.sort(data);
        System.out.println("Sorted Array: " + Arrays.toString(data));
        System.out.println("The greatest number is: " + data[size - 1]);

        System.out.println("======Home Work-2======");
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i] % 2 == 0){
                sumOfEven = sumOfEven + data[i];
            }
            else {
                sumOfOdd = sumOfOdd + data[i];

            }
        }
        System.out.println(Arrays.toString(data));
        System.out.println("Sum of Even Elements: " + sumOfEven);
        System.out.println("Sum of Odd Elements: " + sumOfOdd);

        System.out.println("======Home Work-3======");
        int data1 [] = {10, -1, 0, -23, -20, 16, -15};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < data1.length; i++){
            if (data1[i] >= 0){
               positive++;
            }
            else {
                negative++;
            }
        }
        System.out.println(Arrays.toString(data1));
        System.out.println("Positive Elements - " + positive);
        System.out.println("Negative Elements - " + negative);

            }
        }



