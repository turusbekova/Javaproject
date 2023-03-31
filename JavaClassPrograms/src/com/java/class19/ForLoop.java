package com.java.class19;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("===============");
        for (int i = 1; i <= 10; i++){
            System.out.println(i + 1);
        }

        System.out.println("===============");
       for (int i = 1; i <= 10; i++){
           i = i + 2;
           System.out.println(i);
       }

        System.out.println("===============");
       int sum = 0;
       for (int i = 1; i <= 5; i++){
              sum = sum + i;
           //  0  =  0  + 1
           //  1  =  1  + 2
           //  3  =  3  + 3
           //  6  =  6  + 4
           //  10 =  10 + 5
           // result = 15

           //7+8 get a sum, then sum+9, then sum+6...
       }
        System.out.println("result is " + sum);


    }
}
