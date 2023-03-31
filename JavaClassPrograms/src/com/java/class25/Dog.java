package com.java.class25;

public class Dog {
    String name;
    int age;
    char gender;


    Dog(String nameFromUser, int ageFromUser){
      name = nameFromUser;
      age = ageFromUser;
    }
    void bark(){
        System.out.println(name + " is barking");
    }

    void play(){
        System.out.println(name + " is playing");
    }
}
