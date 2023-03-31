package com.java.homeWork.arrayHW;

import java.util.Scanner;

public class ArrayHomeWork4 {
    public static void main(String[] args) {
        //        3. Program to print the sum of the smallest and greatest number from the array using for-each loop
        //        Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
        //        Output: 124 (100 + 24)


        Scanner scan = new Scanner(System.in);
        int num [] = new int[10];

        System.out.println("Please enter numbers: ");
        for (int i = 0; i < num.length; i++){
            num[i] = scan.nextInt();
        }

        int max = num[0];
        int min = num[0];
        int sum = 0;

        for (int i: num){
            if (i > max){
                max = i;
            }
            else if (i < min){
                min = i;
            }
            sum = max + min;
        }
        System.out.println("the sum of the smallest and greatest number --> " + sum);



    }
}
