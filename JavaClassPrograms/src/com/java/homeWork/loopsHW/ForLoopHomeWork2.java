package com.java.homeWork.loopsHW;

public class ForLoopHomeWork2 {
    //            4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
//            5.  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
//            6.  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2 (edited)

    public static void main(String[] args) {
        System.out.println("============Home Work - 4==============");
        int sum1 = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 3 == 0){
                sum1 -= i;
            }
            else {
                sum1 += i;
            }
        }
        System.out.println("sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10 is " +"\"" +  sum1 +"\"");

        System.out.println("============Home Work - 5==============");
        int sum = 0;
        for (int i = 1, j = 10; i <= 5; i++, j--){
            sum += i + j;
        }
        System.out.println("sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5 is " +"\"" +  sum +"\"");

        System.out.println("============Home Work - 6==============");
        int sum2 = 0;
        for (int i = 1; i <= 5; i++){
            //                          i^2
            sum2 = sum2 + (int)Math.pow(i,2);
            //                            i^i
            //sum2 = sum2 + (int)Math.pow(i,i);
           // sum2 += i * i;
        }
        System.out.println("sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2 is " +"\"" +  sum2 +"\"");

    }
}
