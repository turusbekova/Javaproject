package com.java.class20;

import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        int reverse = 0;
        while ( num > 0){
            reverse = num % 10; // 123 % 10 = 12.3 = 3
            System.out.print(reverse);
            //num = num / 10; // 123 / 10 = 12 (remove one digit from user)

        }

    }
}
