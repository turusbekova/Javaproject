package com.java.class25;

public class PersonMain {
    public static void main(String[] args) {

        // Initialize memory for the object
        Person obj = new Person();

        obj.name = "Begimai";
        obj.age = 19;
        obj.gender = 'F';
        obj.salary = 5000;

        System.out.println("My names is " + obj.name + "\n"
                + "I'm " + obj.age + "\n"
                + "My gender is " + obj.gender + "\n"
                + "My salary is " + obj.salary + " $");

        obj.eat();
        obj.run();

        System.out.println("================");

        obj.name = "Danaker";
        obj.age = 20;
        obj.gender = 'F';
        obj.salary = 2500;

        System.out.println("Her names is " + obj.name + "\n"
                + "She's " + obj.age + "\n"
                + "Her gender is " + obj.gender + "\n"
                + "Her salary is " + obj.salary + " $");

        obj.eat();
        obj.run();

    }
}
