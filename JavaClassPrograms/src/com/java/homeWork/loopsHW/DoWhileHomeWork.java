package com.java.homeWork.loopsHW;

import java.util.Scanner;

public class DoWhileHomeWork {
//    ================== Homework ======================
//    Write a to take the opening balance and the account name from the user and display the below operations that the user can perform, at the end ask user if they want to perform more operations and then continue the same process until a user enters ‘NO’
//    Output
//    Welcome to the ATM Machine
//    Please enter your account opening balance: 1000
//    Please choose the operations you want to perform
//1) Withdraw
//2) Deposit
//3) Check Balance
//1
//    Please enter the amount you want to withdraw: 500
//    The available balance is: 500
//    Do you want to perform more operations?
//    Press 1 for yes, Press 2 for No
//1
//    Please choose the operations you want to perform
//1) Withdraw
//2) Deposit
//3) Check Balance
//2
//    Please enter the amount you want to deposit: 500
//    The available balance is: 1000
//    Do you want to perform more operations?
//    Press 1 for yes, Press 2 for No
//2
//        2. Write a program to print numbers from 10 to 1 using a do-while loop
//            Output
//10
//        9
//        8
//        7
//        6
//        5
//        4
//        3
//        2
//        1

    public static void main(String[] args) {
        String  operation;
           Scanner scan = new Scanner(System.in);
           System.out.println("Welcome to the ATM Machine");
           System.out.println("Please enter your account opening balance:");
           int balance = scan.nextInt();
          do { System.out.println("Please choose the operations you want to perform\n" +
                   "1) Withdraw\n" +
                   "2) Deposit\n" +
                   "3) Check Balance");
           String operations = scan.next();
           if (operations.equalsIgnoreCase("Withdraw") || operations.equalsIgnoreCase("1")) {
               System.out.println("Please enter the amount you want to withdraw:");
               int withdraw = scan.nextInt();
               balance -= withdraw;
               System.out.println("The available balance is: " + balance);
           } else if (operations.equalsIgnoreCase("Deposit") || operations.equalsIgnoreCase("2")) {
               System.out.println("Please enter the amount you want to deposit:");
               int deposit = scan.nextInt();
               balance += deposit;
               System.out.println("The available balance is: " + balance);

           }
           else if (operations.equalsIgnoreCase("Check Balance") || operations.equalsIgnoreCase("3")){
               System.out.println(operation = scan.next("The available balance is: " + balance));
           }
           System.out.println("Do they want to perform more operations? Yes or No?");
           operation = scan.next();
       }
       while (operation.equalsIgnoreCase("yes"));

       }
    }
