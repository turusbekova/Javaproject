package com.java.class20;

import java.util.Scanner;

// any number that are divisible by 1 and itself called prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;
            }
        }
        System.out.println("Dividers of this number - " + count);
       if (count == 2){
           System.out.println("This is a prime number");
       }
       else {
           System.out.println("This is not a prime number");
       }
        }
    }

