package com.java.homeWork.loopsHW;

import java.util.Scanner;

public class WhileLoopHomeWork {
    public static void main(String[] args) {

        //        Write a program that uses a while loop to print the odd numbers from 1 to 20. => 1,3,5,7,9,11,13,15,17,19
//        Write a program that uses a while loop to print the sum of the numbers from 1 to 10. => 1+2+3+4+5+6+7+8+9+10. result should be 55?
//        Write a program that uses a while loop to print the multiplication table for a given number.
        System.out.println("Home Work - 1");
        int num = 0;
        while (num < 20){
            if (num % 2 != 0){
                System.out.println(num);
            }
            num++;
        }

        System.out.println("Home Work - 2");
        int sum = 0;
        int num1 = 1;
        while (num1 <= 10){
            sum = sum + num1;
            System.out.println("The sum of numbers: " + sum);
            num1++;
        }

        System.out.println("Home Work - 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n1 = scan.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(n1 + " * " + i + " = " + n1 * i);
            i++;
        }



    }
}
