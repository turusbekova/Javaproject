package com.java.class21;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int rev = 0;


//        while (num > 0) {
//            int lastDigit = num % 10;
//            rev = rev * 10 + lastDigit;
//            num = num / 10;
//        }
//        System.out.println(rev);

        while (num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }

    }
}
