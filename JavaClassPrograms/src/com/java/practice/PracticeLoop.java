package com.java.practice;

public class PracticeLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print(k * i + "\t");
            }
            System.out.println("\t");
        }
    }
}
