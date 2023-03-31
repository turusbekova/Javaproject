package com.java.homeWork.loopsHW;

import java.util.Scanner;

public class ForLoopHomeWork {
//    ===================== Homework =========================
//            1. Write a program to print the sum of even numbers from 1 to 10
//            2. Write a program to count the number of divisors of the given numbers
//    For example - Number 6 has 4 divisors & 12 has 6 divisors
//  3. Write a program to find a magic number from 1 to 100,
//            if you divide that number by 5 you will get remainder 4
//            if you divide that number by 4 you will get remainder 3
//            if you divide that number by 3 you will get remainder 2
//            if you divide that number by 2 you will get remainder 1
public static void main(String[] args) {
    System.out.println("============Home Work - 1===============");
    int sum = 0;
    for (int i = 1; i <= 10; i++){
        if (i % 2 == 0){ // 2 4 6 8 10
            System.out.println(sum += i);
        }
    }
    System.out.println("The sum of even numbers: " + sum);

    System.out.println("============Home Work - 2===============");
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int num = scan.nextInt();
    int counter= 0;
    for (int i = 1; i <= num; i++){
         if (num % i == 0){
            counter++;
        }
    }
    System.out.println("Number of divisors: " + counter);

    System.out.println("============Home Work - 3==============");

    for (int i = 1; i <= 100; i++){
        if(i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1){
            System.out.println("The magic number is " + i);
        }
    }






}
}
