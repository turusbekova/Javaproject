package com.java.class24;

import java.util.Arrays;
import java.util.Scanner;

public class Get2DArrayFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data [][] = new int[3][3];



        for (int i = 0; i < data.length; i++){
        //    int greatestNum = Integer.MIN_VALUE;
            System.out.println("Please enter 3 numbers for row: " + (i + 1));
            data[i][0] = scan.nextInt();
            int greatestNum = data[i][0];

            for (int j = 0; j < data[i].length; j++){
                data[i][j] = scan.nextInt();
                if (data[i][j] > greatestNum) {
                    greatestNum = data[i][j];
                }
            }

            System.out.println("The greatest number in row " + (i + 1) + " is " + greatestNum);
        }

        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++ ){
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
