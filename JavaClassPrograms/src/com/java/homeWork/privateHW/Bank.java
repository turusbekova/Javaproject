package com.java.homeWork.privateHW;

public class Bank {

    private static int numAccounts = 0;
    private static double totalDeposits = 0;


    private String name;
    private int accountNumber;
    private double balance;

    public Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;


        numAccounts++;
        totalDeposits += balance;
        accountNumber = numAccounts;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }
    public static double getTotalDeposits() {
        return totalDeposits;
    }

    public void deposit(double amount) {
        balance += amount;
        totalDeposits += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            totalDeposits -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}

 class BankMainClass {
    public static void main(String[] args) {
        Bank account1 = new Bank("John", 1000);
        Bank account2 = new Bank("Mary", 500);

        account1.deposit(500);
        account2.withdraw(200);

        System.out.println("Total number of accounts: " + Bank.getNumAccounts());
        System.out.println("Total deposits: " + Bank.getTotalDeposits());

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
