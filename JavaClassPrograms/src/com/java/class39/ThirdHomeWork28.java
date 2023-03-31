package com.java.class39;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThirdHomeWork28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        // take data from user
        System.out.println("Enter any string");
        String str = sc.nextLine();

        //split string by space to get collections of words
        String [] listOfString = str.split(" ");

        // add each word from the array to set & if it is doplicate remove that word from set
        for (int i = 0; i < listOfString.length; i++){
            if(!words.add(listOfString[i])){
                words.remove(listOfString[i]);
            }
        }

        System.out.println(words);
    }
}
