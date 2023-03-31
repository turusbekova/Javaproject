package com.java.class22;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num [] = {10, 30, 50, 30, 70, 40, 45, 32};
        int sum = 0;
        int num2 = 70;
        for (int i = 0; i < num.length; i++){
//            sum += num[i];
            if (num[i] == num2){
                System.out.println(i);
            }
        }

        // Declaration of array

        int data[] = new int [10];
        for (int i = 0; i < data.length; i++){
            data[i] = scan.nextInt();
        }



    }


}
