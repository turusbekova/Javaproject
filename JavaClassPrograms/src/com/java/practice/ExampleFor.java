package com.java.practice;

public class ExampleFor {
    public static void main(String[] args) {
        int a [] = {0, 1, 2, 2, 0,3};

        for (int i = 0; i < a.length; i++){
            a[i] = a[a[i] + 2] % a.length;
            //индекс  0 + 2 = 2 (2) % 6 (полная длина)
        }
        for (int i: a){
            System.out.println(i);
        }


        System.out.println("=============");
        String str = "Hello";
        int num1 = 20;
        int num2 = 30;
        System.out.println(str + num1 + num2);
   //   System.out.println(str + num1 - num2); --> compile error


    }
}
