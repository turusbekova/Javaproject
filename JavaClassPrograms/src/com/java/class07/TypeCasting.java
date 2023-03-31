package com.java.class07;

public class TypeCasting {
    public static void main(String[] args) {
         // Error types in Java
        // 1. Compilation error - type of error that happens before running the program
         // 2. Runtime error - type of error that happens while your program is already running

        // incompatible means - not supported. things that don't fit each other
        //  2 problems - 1) trying to put decimal pointed numbers into whole number data types
        // 2) when trying to push in bigger data types
        double gasPrice = 1.99;
       // int wholeNumber = gasPrice; // incompatible types compilation error
         // int b = 10.5 // incompatible types compilation error

        int a = 40;
       // short smallNum = a; //incompatible types compilation error

        // vocab:
        // truncate - remove(delete)

        // explicit type casting - manual
        // (int) is a type casting operator
        double price = 2.99;
        int convert = (int) price;
        System.out.println(convert);

        double num2 = 9.01;
        int convert2 = (int) num2;
        System.out.println(convert2);


        //convert floatNum into a byte and printout byte number
        float floatNum = 2.4f;
        byte num3 = (byte) floatNum;
        System.out.println(num3);

        // implicit - automatically casting

        int num1 = 24;
        double doubleNum = num1; //automatically adds .0 at the end
        System.out.println(doubleNum); // 24.0

        int num5 = 55;
        double doubleNum2 = num5;
        System.out.println(doubleNum2);



        // I want to get Average customer spending on my products
        // I sold $4.544.95.96
        //64 - clients
        // find what is th average customer spending
        System.out.println("-----Average Spending------");
        int clients = 64;
        double sold = 4544950.96;
        int total = (int) sold / clients;
        System.out.println(total);

        //I drove 100 miles
        // gallons of gas = 2.4;
        // how many gallons per mile did i spend

        System.out.println("----Miles per gallon----");
        int miles = 100;
        double gallons = 2.4;
        double spend = miles / gallons;
        System.out.println(spend);







    }
}
