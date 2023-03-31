package com.java.class06;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        // compiling a code => checking if we are matching all syntax rules
        //before you can use scanner you have to have import statement
        //before public class line

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your userName: ");
//        String userName = scan.next();
//        System.out.println(userName + " this is your userName");
//        System.out.println("Enter your password: ");
//        int password = scan.nextInt();
//        System.out.println(password + " this is your password");
//        System.out.println("Welcome to LMS");

        // scan.next(); -> will enable us to input and String data to our program
        // it will allow us to enter an integer

        // nextInt(), nextLine(), nextBoolean() -> they are all
        // methods
        // all methods return a result

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("your name is " + name);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("your age is " + age);
        System.out.println("Enter your marital status: ");
        String status = scan.next();
        System.out.println("your status is " + status);
        System.out.println("Enter your secret word: ");
        String word = scan.next();
        System.out.println("your secret word is " + word);
        System.out.println("Enter your secret sentence: ");
        String sentence = scan.nextLine();
        System.out.println("your secret sentence is " + sentence);

        // next() - takes only one word (the text until the first space)
        // nextLine() -> takes full line of text




    }
}
