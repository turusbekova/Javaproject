package com.java.class20;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        int count = 0;
        while (num > 0){
            num = num / 10; // remove one digit from number
            count++;
        }
        System.out.println(count);
//        int len = (int) (Math.log10(num) + 1);
//        System.out.println("Length of this number - " + len);
    }
}
