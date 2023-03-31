package com.java.class29;

class Animals {
    Animals(String name){
        System.out.println("From Animal " + name);
    }
}

class Dog extends Animals {
    Dog(String name){
        super("abc");
        System.out.println("From Dog " + name);
    }
}

class Pets extends Dog{
    Pets(){
        super("Jhonty");
        System.out.println("From Pets ");
    }
}
public class ConstructorChainingWithParams {
    public static void main(String[] args) {
        Pets pet = new Pets();
    }
}
