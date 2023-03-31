package com.java.class31;

public class BankMain {
    public static void main(String[] args) {
        Bank b = new ChaseBank();
        ChaseBank chaseBank = new ChaseBank();
        b.displayRateOfInterest();
        b.deposit();
        b.withdraw();

        PayPal paypal = new PayPal();
        paypal.displayRateOfInterest(chaseBank);
        CitiBank citiBank = new CitiBank();
        paypal.displayRateOfInterest(citiBank);



    }
}
