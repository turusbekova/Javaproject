package com.java.class37;

import java.util.Scanner;

class ExceptionExample2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = scan.nextLine();

        if (browser.equals("fireFox")){
            System.out.println("Opening FireFox");
        }
        else if (browser.equals("chrome")){
            System.out.println("Opening Chrome");
        }
        else {
            throw new RuntimeException("Invalid");
        }

        System.out.println("Opening login page");
        System.out.println("Doing login");
        System.out.println("Verifying homepage");
        System.out.println("Closing the browser");
    }
}

public class PurposeOfException {
    public static void main(String[] args) {
       // throw new ArrayIndexOutOfBoundsException("something"); --> throw new should be in the end
        // the program because it breaks the program
        System.err.println("Very Very invalid input");
        System.out.println("Continuing program");
        System.out.println("How are you?");

        throw new ArrayIndexOutOfBoundsException("something");
    }
}
