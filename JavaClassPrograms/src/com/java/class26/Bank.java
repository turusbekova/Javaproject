package com.java.class26;

public class Bank {
    double balance;
    String accName;
    String accNumber;

    // Parameterized Constructor
    Bank(String accNameFromUser, String accNumFromUser){
      balance = 0;
      accName = accNameFromUser;
      accNumber = accNumFromUser;
    }

    // No Arg Constructor
    Bank(){
        System.out.println("No Arg Constructor");
    }

    void deposit(int amount){
        System.out.println(accName + " is trying to deposit " + amount + " into " + accNumber);
        balance = balance + amount;
    }

    void withdraw(int amount){
        System.out.println(accName + " is trying to withdraw " + amount + " from " + accNumber);
        balance = balance - amount;
    }
}
