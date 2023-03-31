package com.java.class25;

public class DogMain {
    public static void main(String[] args) {
        Dog obj = new Dog("Jack", 3);

//        obj.name = "Sharik";
//        obj.age = 2;
        obj.gender = 'F';

        System.out.println(obj.name + " is " + obj.age +
                " years old " + "\n" + obj.name + "'s" +
                " gender is " + obj.gender);


    }
}
