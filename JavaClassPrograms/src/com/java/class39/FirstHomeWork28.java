package com.java.class39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstHomeWork28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Take data from user
        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
            numbers.add(scan.nextInt());
        }

        // Sort numbers and print
        Collections.sort(numbers);
        System.out.println(numbers);


    }
}
