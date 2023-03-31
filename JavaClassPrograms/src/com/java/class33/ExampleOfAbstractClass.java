package com.java.class33;

abstract class BankAbstract{
    BankAbstract(){

    }
  public abstract void displayRateOfInterest(); // Abstract method
}

class CitiBankAbstr extends BankAbstract{
    public void displayRateOfInterest(){
        System.out.println("5.0");
    }
}

class ChaseBankAb extends BankAbstract{
    public void displayRateOfInterest(){
        System.out.println("6.0");
    }
}

public class ExampleOfAbstractClass {
    public static void main(String[] args) {
        BankAbstract b = new BankAbstract() {
            @Override
            public void displayRateOfInterest() {

            }
        };
    }
}
