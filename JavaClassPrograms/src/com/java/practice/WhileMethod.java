package com.java.practice;

import java.util.Scanner;

public class WhileMethod {
    public static void main(String[] args) {
//        int age = 17;
//
//        //      17 <= 20 --> будет крутиться пока не будет 20
//        while (age < 20){
//            System.out.println("0000");
//            age++;
////            0000
////            0000
////            0000  -> 20 - 17 = 3
//
//        }
        int age = 10; // начало диапазона
        do { // не нуждается в бади сразу делает
            System.out.println("-----------");
            age++;
        }
        while (age < 20); // конец диапазона
        // результат показал потому что здесь он сперва делает а потом думает
        // a так while если условие false то не будет заходить в бади

        int n1 = 5;
        int i = 1; // с 1 одного начинает умножать
        while (i <= 10 ){
            System.out.println(n1 + "\t*\t" + i + "\t=\t" + n1  * i); // \t - пробелы
            i++;
        }

        System.out.println("----------------------------");
        int salary = 1500;
        int score = 0;
        while (score < 7){
            System.out.println(salary * score);
            score++;
        }
        System.out.println(salary * score + " your full salary for this week");






}
}
