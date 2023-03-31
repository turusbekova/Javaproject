package com.java.homeWork.arrayHW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork5 {
    public static void main(String[] args) {
        //        2.  Write a program to find the sum of array elements using for-each loop
        //        Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //        Output: 55

        Scanner scan = new Scanner(System.in);
        int numbers [] = new int[10];
        int sumOfNumbers = 0;

        System.out.println("Please enter numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }
        System.out.println("Array Elements: " + Arrays.toString(numbers));

        for (int i: numbers){
           sumOfNumbers = sumOfNumbers + i;
        }
        System.out.println("The sum of array elements --> " + sumOfNumbers);
    }
}
