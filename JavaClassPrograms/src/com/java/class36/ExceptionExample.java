package com.java.class36;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num = scan.nextInt(), num2 = scan.nextInt();
        System.out.println(num / num2);
    }
}
