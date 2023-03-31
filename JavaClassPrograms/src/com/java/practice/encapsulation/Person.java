package com.java.practice.encapsulation;
class charPerson{
    public String name;
    protected int age;
    public char gender;
    private String phoneNumber = "1234567";

    public String getPhoneNumber() {
        return phoneNumber; // помогает возвратить private переменную
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; // помогает переназначить private переменную
    }
    // private используют для того чтобы если вы заранее создали данные которые нежелательно менять
    // в крайнем случае если понадобится поменять то используется get/set

    // get/set --> encapsulation in java

    // private instance variables --> getter/setter --> Encapsulation

    public charPerson(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public charPerson(String name, int age, char gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "charPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String moving(){
        return name + " is moving";
    }

    public String speaking(){
        return name + " is speaking";
    }
}

public class Person {
    public static void main(String[] args) {
        charPerson begim = new charPerson("Begimai", 19, 'f', "1234567");
        begim.name = "Begish";
        begim.age = 20;
        begim.getPhoneNumber();
        System.out.println(begim.name + " age: " + begim.age + " gender: " + begim.gender + " phoneNumber: " + begim.getPhoneNumber());
        System.out.println(begim);
        System.out.println(begim.moving());
        System.out.println(begim.speaking());

        charPerson baha = new charPerson("Baha", 24, 'm');
        baha.setPhoneNumber("+996702446822");
        System.out.println(baha);

    }
}
