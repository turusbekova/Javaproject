package com.java.class12;

import java.util.Scanner;

public class MethodsIntro {
    public static void main(String[] args) {
//        double num = calculateTax();
//        System.out.println(num);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your annual salary: ");
//        double salary = scan.nextDouble();
//

//        double taxAmount = calculateTax2(120000);
//        System.out.println(taxAmount);

   //     String country = countryTax("Dubai");
     //   System.out.println(country);

     //  countryTax2();

        System.out.println(countryTax("Dubai"));
        System.out.println(countryTax("Germany"));
        System.out.println(countryTax("Maldives"));

        sayHello();

        countryTax3("Dubai");
        countryTax3("New York");
        countryTax3("London");
    }
    public static String countryTax (String country){
        return "I want to travel to " + country;
    }

    public static void countryTax3 (String country){
        System.out.println("I want to travel to " + country);
    }


    public static void countryTax2(){
        System.out.println("Where do you want to travel?");
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        System.out.println("I want to travel " + country);
    }


    public static double calculateTax(){
        return 10*2;
    }

    public static void sayHello(){
        int year = 2023;
        double targetSalary = 130000;
        System.out.println("Hello " + year);
        System.out.println("My target salary is " + targetSalary);
    }

    public static double calculateTax2(double salary) {
        if (salary < 100000) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }

    }
}
