package com.java.class30;
class Bank {
    void displayOfInterest(int amount){
        System.out.println(amount);
    }

    void displayOfInterest(){
        System.out.println("Hello");
    }

}


public class MethodOverloadingExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.displayOfInterest();

    }
}
