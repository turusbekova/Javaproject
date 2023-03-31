package com.java.practice;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        // таблица умножения
        // boolean - нельзя использовать так как нельзя его увеличивать
        for (int i = 2; i <= 7; i++){
            //                 2         *          2 = 4
            //                 3         *          2 = 6
            //                 4         *          2 = 8
            System.out.println(i + " * " +" 2 = " + i  * 2);
        }
        System.out.println("============================");

//        4 --> 2 * 2
//        6 --> 3 * 2
//        8 --> 4 * 2
//        10--> 5 * 2
//        12--> 6 * 2
//        14--> 7 * 2

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the beginning of the range:");
        int n1 = scan.nextInt();
        System.out.println("Write the ending of the range: ");
        int n2 = scan.nextInt();

        for (int i = n1; i <= n2; i++){
            if (i % 2 == 0 ){
                System.out.println(i + " even numbers");
            }
            else {
                System.out.println(i + " odd numbers");
            }
        }


        System.out.println("==================");
        String str = "ololo house"; // 4 'o'
        // score - счет,
        // int score = 0 ; 0 потому что он начнет прибавлять к нулю
        int score = 0 ; // для того чтобы расчитать буквы
        //              0 <  11
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'o'){ // если каждая буква из цикла равняется о то прибавляет
               score++; // тут только счет должен увеличиваться
            }
        }
        System.out.println("we have " + score + " \'o\' letters");
        // sout здесь потому что сама переменная score находится вне зоны for



    }
}
