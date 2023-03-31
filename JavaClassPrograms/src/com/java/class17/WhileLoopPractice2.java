package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        String str = "Let's go Mars";
        int num = str.length();
        int startingIndex = 0;

        // if you need to increment use the var < how many times you need to run

//        while (startingIndex <= num){
//            char eachChar = str.charAt(startingIndex);
//            System.out.println(eachChar);
//            startingIndex++;
//        }


//        System.out.println("=========================");
//        String str1 = "Obama";
//        int num1 = str1.length() - 1;
//        while (num1 > 0){
//            char letters = str1.charAt(num1);
//            System.out.println(letters);
//            num1--;
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.nextLine();
//        int i = 0;
      int numOfLetters = word.length();
//        while (i < numOfLetters){
//            char charAt = word.charAt(i);
//            if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u'){
//                System.out.println(charAt);
//            }
//            i++;
//        }


        int j = 1;
        while (j < numOfLetters){
            char charAt = word.charAt(j);
            j += 2;
            System.out.println(charAt);
            j++;
        }


    }
}
