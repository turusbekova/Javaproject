package com.java.class22;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int s = 0; s <= i - 1; s++ ){
                System.out.print(" ");
            }

            for (int j = 11 - i * 2; j >= 1; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
