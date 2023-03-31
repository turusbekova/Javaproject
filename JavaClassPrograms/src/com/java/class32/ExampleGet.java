package com.java.class32;

import com.java.class26.Bank;

class BankGet{
    int accountNumber;

    private BankGet(){ // we can't call private constructor
        accountNumber = 123456;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class ExampleGet {
//    public static void main(String[] args) {
//        BankGet b = new BankGet(); // compile error
//        System.out.println(b.accountNumber);
//    }
}
