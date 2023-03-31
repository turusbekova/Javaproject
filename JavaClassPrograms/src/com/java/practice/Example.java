package com.java.practice;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        int tryAgainLogin = 3;
        int tryAgainPassword = 4;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while (i < tryAgainLogin) {
            System.out.println("Please enter your login: ");
            String login = scan.nextLine();
            String password = null;
            if (login.trim().equalsIgnoreCase("Begimai")) {
                if (login.startsWith(" ") || login.endsWith(" ")) {
                    System.out.println("Your login accepted! \nBut you have spaces in your login: " + "\"" + login + "\"");
                }
                while (i < tryAgainPassword) {
                    System.out.println("Please enter your password: ");
                    password = scan.nextLine();
                    if (password.trim().equalsIgnoreCase("Bim123")) {
                        System.out.println("Well done!");
                        if (password.startsWith(" ") || password.endsWith(" ")) {
                            System.out.println("Your password accepted! \nBut you have spaces in you password: " + "\"" + password + "\"");
                        }
                        break;
                    }
                }
                i++;
                break;
            }

        }

    }
}
