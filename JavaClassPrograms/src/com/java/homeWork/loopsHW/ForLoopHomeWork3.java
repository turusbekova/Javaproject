package com.java.homeWork.loopsHW;

import java.util.Scanner;

public class ForLoopHomeWork3 {
//    ===================== Homework =========================
//            1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
//            2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
//    Note - Please print the sum in decimal, answer should not be zero
//  3. Write a program to print the sum of each digit from the given number
//    Example1
//    Input - 3521
//    Output - 11
//    Example2
//    Input - 5390
//    Output - 17
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

    public static void main(String[] args) {
        System.out.println("============Home Work - 1===============");
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum += Math.pow(i,i);
        }
        System.out.println("The sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5: " + sum);

        System.out.println("============Home Work - 2===============");
        double sum1 = 0.0;
        for (int i = 1; i <= 10; i++){
            sum1 += (i / (double)(i + 1));
        }
        System.out.println("The sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11: " + sum1);

        System.out.println("============Home Work - 3===============");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long num = scan.nextLong();
        long sum2 = 0;
        while (num > 0){
            sum2 += num % 10;
            num = num / 10;
        }
        System.out.println("The sum of each digit: "  + sum2);



    }

}
