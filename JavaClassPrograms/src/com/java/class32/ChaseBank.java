package com.java.class32;

public class ChaseBank{
   public int balance;

  public ChaseBank(){

   }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }
}
class PurposeAccessModifier {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.deposit(5000);
        cb.balance = 12345678;
        System.out.println(cb.balance);

        // if your variables or methods are protected or default you can just add static

    }
}
