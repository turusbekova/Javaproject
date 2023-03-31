package com.java.class13;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Scanner;

public class StringMethodsPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your firstname:");
        String firstname = scan.nextLine();
        if (firstname.equalsIgnoreCase("Begimai")){
            System.out.println("Enter your lastname:");
            String lastname = scan.nextLine();
            if (lastname.equalsIgnoreCase("Turusbekova")){
                System.out.println("Enter your password:");
                String password = scan.nextLine();
                if (password.equalsIgnoreCase("12345")){
                    System.out.println("Welcome");
                }
                else {
                    System.out.println("Invalid password");
                }
            }

            else {
                System.out.println("invalid lastname");
            }
        }
        else {
            System.out.println("Invalid firstname");
        }
    }
}
