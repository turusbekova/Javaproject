package com.java.class08;

import java.util.Scanner;

public class OddOrGiven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number: ");
        int num = scan.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }
    }
}
