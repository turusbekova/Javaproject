package com.java.class19;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        System.out.print("Factors of " + num + " are: ");
//        for (int i = 1; i <= num; ++i) {
//            if (num % i == 0) {
//                System.out.print(i + " ");
//            }
//        }

        for (int i = 1; i <= num; ++i){
            if (num % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
