package com.java.class10;

import java.util.Scanner;

public class IfElseStatementPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your numbers");
        System.out.println("Your first number:");
        int n1 = scan.nextInt();
        System.out.println("Your second number: ");
        int n2 = scan.nextInt();
        System.out.println("Your third number: ");
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("First number is largest" + n1);
        }
        else if (n2 > n1 && n2 > n3 ){
            System.out.println("Second number is largest" + n2);
        }
        else if (n3 > n2 && n3 > n1){
            System.out.println("Third number is largest: " + n3);
        }
        else if (n3 == n1 && n3 == n2){
            System.out.println("All numbers are equal");
        }
        else if (n1 == n2 && n1 > n3){
            System.out.println(n1 + " is largest");
        }
        else {
            System.err.println("Invalid");
        }
    }
}
