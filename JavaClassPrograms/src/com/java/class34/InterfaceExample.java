package com.java.class34;

interface Bank{

    int a = 10;

     void displayRateOfInterest();
     void withdraw(int amount);
     void deposit(int amount);

   // We didn't write "abstract" in the methods because it's abstract by default?
}

interface InternationalBank extends Bank{
    void displaySwiftCode();
}

class CitiBank implements Bank, InternationalBank{

    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void displaySwiftCode() {

    }
}

class ChaseBank implements Bank{

    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }
}


public class InterfaceExample {

}
