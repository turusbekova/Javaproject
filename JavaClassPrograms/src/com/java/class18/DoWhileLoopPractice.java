package com.java.class18;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter a number:");
            int num = scan.nextInt();
            System.out.println(num * num);
            System.out.println("Would you like to continue? Yes or No");
            choice = scan.next();
        }
        while (choice.equalsIgnoreCase("yes"));


    }
}
