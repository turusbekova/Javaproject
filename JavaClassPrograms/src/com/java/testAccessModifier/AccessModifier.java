package com.java.testAccessModifier;

import com.java.class32.ChaseBank;

public class AccessModifier {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        System.out.println(cb.balance);

        cb.withdraw(1000);
        cb.deposit(1000);

    }
}
