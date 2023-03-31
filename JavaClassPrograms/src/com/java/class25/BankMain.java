package com.java.class25;

public class BankMain {
    public static void main(String[] args) {
        Bank begimaiAccount = new Bank();
        begimaiAccount.balance = 5000;
        begimaiAccount.accName = "Begimai";
        begimaiAccount.withdraw(600);
        System.out.println(begimaiAccount.balance);

        System.out.println("======================");
        begimaiAccount.accName = "Zarina";
        begimaiAccount.balance = 1000;
        begimaiAccount.deposit(600);
        System.out.println(begimaiAccount.balance);


    }
}
