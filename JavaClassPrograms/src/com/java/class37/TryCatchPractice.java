package com.java.class37;

import java.util.Scanner;

public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age:");

        try{
            int age = scan.nextInt();
            if (age >= 13 && age <= 19){
                System.out.println("Teenager");
            }
            else if(age <= 0 || age >= 100){
                System.out.println("it is  impossible");
            }
        }
        catch (Exception e){
            System.out.println("Invalid");
        }
    }
}
