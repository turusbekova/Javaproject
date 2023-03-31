package com.java.class22;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int num1 = num;

        int rev = 0;
         while (num > 0){
             int lastDigit = num % 10;
             rev = rev * 10 + lastDigit;
             num = num / 10;
         }

        System.out.println(rev);
         if (rev == num1){
             System.out.println("Palindrome");
         }
         else {
             System.out.println("Not Palindrome");
         }
    }
}
