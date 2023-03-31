package com.java.class38;

import java.util.*;

public class HomeWorkCollection {
    public static void main(String[] args) {
//        Task 1: Write a program to get five numbers from the user and sort them in ascending order using the list
//        Task 2: Write a program to get five numbers from the user and print all numbers in reverse sequence
//        Example:
//        Input -  45, 67, 23, 12, 43
//        Output - 43, 12, 23, 67, 45
//        Task 3: Write a program to print unique words from the Given String
//        Example:
//        Input - well, collection is very easiest topic in java and it is very useful as well
//        Output - collection easiest topic in java and it useful as well
        System.out.println("Task 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write 5 numbers");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            numbers.add(num);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Task 2");
        System.out.println("Please write 5 numbers");
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            number.add(num);
        }
        System.out.println("print all numbers in reverse sequence");
        Collections.reverse(number);
        System.out.println(number);

        System.out.println("Task 3");
        String str = "well, collection is very easiest topic in java and it is very useful as well";
        String[] words = str.split("[,\\s]+");
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            if (!word.equals("well")) { // skip the word "well"
                uniqueWords.add(word);
            }
        }
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}
