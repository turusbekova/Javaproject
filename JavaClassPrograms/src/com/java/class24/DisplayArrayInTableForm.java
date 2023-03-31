package com.java.class24;

public class DisplayArrayInTableForm {
    public static void main(String[] args) {
        int data[][] = {
                {3, 5, 7},
                {5, 7, 2},
                {6, 3, 1}
    };
    int sum = 0;
        for (int i = 0; i < data.length; i++){
            int sumOfRow = 0;
        for (int j = 0; j < data[i].length; j++){
//            sum = sum + data[i][j];
            sumOfRow = sumOfRow + data[i][j];
        }
            System.out.println("Som of row " + (i + 1) + ": " + sumOfRow);
    }


    }
}
