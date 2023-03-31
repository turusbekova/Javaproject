package com.java.class19;

public class ForLoopExamples {
    public static void main(String[] args) {
        // 1 * 2 * 3 * 4 * 5
        int result = 1;
        for (int i = 1; i <= 5; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
