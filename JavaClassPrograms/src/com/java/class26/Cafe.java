package com.java.class26;

public class Cafe {
    String nameOfCafe;
    Cafe(String nameOfCafeFromUser){
        nameOfCafe = nameOfCafeFromUser;
        System.out.println("Welcome to " + nameOfCafe);
    }

    Cafe(){
        System.out.println("Can I help you?");
    }

    void order(){
        System.out.println("Do you want to order something?");
    }
}
