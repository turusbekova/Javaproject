package com.java.class36;

import java.util.Scanner;

public class HomeWorkTryCatch {

    static int divide(int num1, int num2){
       return num1 / num2;
    }

    public static void main(String[] args) {
//        Task 1:
//        Create a class & take two integer values from the user
//        Perform division operation & handle the appropriate Exception
//        Create a String variable with a null value
//        Find the length of the null variable and handle the appropriate Exception
//        Create an array of five integers
//        Access the element at the fifth position
//        Handle the appropriate Exception


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        try {
            System.out.println(num1 / num2);
        }catch (ArithmeticException e){
            System.err.println("We can't divide to zero");
        }

        String str = null;
        try {
            System.out.println(str.length());
        }
        catch (Exception e){
            System.err.println("String is empty");
        }

        int[] numbers = { 10, 20, 30, 40, 50 };

        try {
            int fifthNumber = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Out of Bound");
        }




    }
}
