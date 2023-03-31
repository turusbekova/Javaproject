package com.java.practice.constructorPractice;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructor1 bugatti = new Constructor1();

        bugatti.mark = "Bugatti";
        bugatti.model = "Chiron";
        bugatti.color = "Black";
        bugatti.wheel = 4;
        bugatti.volume = 2.3;
        bugatti.year = 2020;

        bugatti.getInfo();

        Constructor2 ferrari = new Constructor2("ferrari", "La Ferrari", "red", 8.0,4, 2020);
        ferrari.getInfo();
        System.out.println("=========================");
        ferrari.color = "green";

        ferrari.getInfo();

        Constructor2 tesla = new Constructor2("Tesla", "S", 2019);
        // overload --> название одинаковое а параметры разные


    }
}
