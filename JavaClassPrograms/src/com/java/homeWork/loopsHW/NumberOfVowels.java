package com.java.homeWork.loopsHW;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
//        ===================== Homework =========================
//        1. Write a program to count the number of vowels from the String (Ignoring Case)
//        Example
//        Input - Welcome to Java Class
//        Output - Num of vowels=7
//        2. Write a program to print reverse of the given String
//        Example
//        Input - Wedevx
//        Output - xvedeW

        System.out.println("=========Home Work - 1=========");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.nextLine();
        int vowel = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' ||
                    str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
                    || str.toLowerCase().charAt(i) == 'u' ){
                vowel ++;
            }
        }
        System.out.println( "The number of vowels: " + vowel);

        System.out.println("=========Home Work - 2=========");
        System.out.println("Please enter a string: ");
        String str2 = scan.nextLine();
        int rev = 0;

        for (int i = str2.length() - 1; i >= 0; i--){
            System.out.println(str2.toLowerCase().charAt(i));
        }

        System.out.println("=========Home Work - 3=========");
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        int number2 = number;

        int reverse = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);

        if (reverse == number2){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
