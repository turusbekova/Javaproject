package com.java.homeWork.methodsAndDataType;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class MethodsStringHomeWork {
    public static void main(String[] args) {
//        Homework 1:
//        Write a method that takes a string and returns true if the string starts with “hi” and false otherwise.

//        Homework 2:
//        Write a method that takes a string   returns a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//        extraEnd(“Hi”) → “HiHiHi”
//        extraEnd(“Hello”) → “lololo”
//        extraEnd(“ab”) → “ababab”

//        Homework 3:
//        Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so “coding” yields “codign”.
//        lastTwo(“coding”) → “codign”
//        lastTwo(“cat”) → “cta”
//        lastTwo(“ab”) → “ba”

//          HomeWork - 1
//        System.out.println("Please enter WORD/SENTENCE:");
//        String wordOrSentence = scan.nextLine();
//        trueOrFalse(wordOrSentence);

//       HomeWork - 2
//                System.out.println("Please enter a word:");
//        String word = scan.next();
//        System.out.println(copies(word));


        // HomeWork - 3
//        System.out.println("Please enter a word:");
//        String word = scan.next();
//        //System.out.println(swappingLetters(word));
//        System.out.println(swappingLetters(word));


        Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a word:");
    String word = scan.next();
    System.out.println(copies(word));
}
        public static String copies(String word){
        return word + word + word;
   }



    public static String swappingLetters(String word){
        String word1 = word.substring(0, word.length()-2);
        return word1 + word.charAt(word.length()-1) + word.charAt(word.length()-2);
    }




    // HomeWork - 2
//    public static String copies(String word){
//        return word + word + word;
//    }

//     HomeWork - 1
//    public static void trueOrFalse(String wordOrSentence){
//        if (wordOrSentence.substring(0,2).equalsIgnoreCase("hi")){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

}
