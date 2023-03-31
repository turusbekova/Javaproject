package com.java.class21;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int max = num % 10; // 12345 --> 5

        while (num > 0) {
            int lastDigit = num % 10;
            //               5
            if (lastDigit > max){
                max = lastDigit;
            }
            num = num / 10;
        }
        System.out.println(max);
    }
}
