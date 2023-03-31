package com.java.homeWork.loopsHW;

public class WhileLoopHomeWork2 {
//    Homework:
//    Write a program that calculates the sum of all even numbers between 1 and a 100 using a while loop.
//2+4+6+8 … = ?
//        2. Write a program that prints all prime numbers between 1 and a 100  using a while loop.
//            white_check_mark
//            eyes
//    raised_hands
public static void main(String[] args) {
//    int i = 0;
//    int sum = 0;
//
//   while (i <= 100){
//       sum += i;
//       i += 2;
//   }
//    System.out.println("The sum of all even numbers: " + sum);

 
    int primeNum = 1;

while (primeNum % 2 != 0 && primeNum < 100){
    System.out.println(primeNum);
    primeNum += 2;
}
}









}
