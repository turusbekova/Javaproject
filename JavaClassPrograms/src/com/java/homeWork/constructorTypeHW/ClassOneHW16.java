package com.java.homeWork.constructorTypeHW;

class Iphone {
    String model;
    String color;
    String year;
    static int price;
    static int phoneNumber;

    public Iphone(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Iphone(){
        System.out.println("This constructor without parameters");
    }

    void call(){
        System.out.println(model + " is calling");
    }

    void text(){
        System.out.println(model + " is sending ");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

class MainIphone{
    public static void main(String[] args) {
        Iphone phone = new Iphone();
        Iphone phone2 = new Iphone("IPhone 13Pro", "BLACK", "2022");
        Iphone staticVariables = new Iphone();

        System.out.println("Static Variables: ");
        staticVariables.price = 1233;
        staticVariables.phoneNumber = 99612345;
        System.out.println(staticVariables.price);
        System.out.println(staticVariables.phoneNumber);

        System.out.println("============================");
        phone.model = "Iphone 14 Pro Max";
        phone.color = "Dark Blue";
        phone.year = "2022";
        System.out.println(phone);

        phone2.call();
        phone2.text();


    }
}


public class ClassOneHW16 {
//    Task 1:
//    Write a program to create an IPhone Class with variables (property) and methods (actions) inside it., Create three constructors inside the IPhone class
//    Identify and create static variables inside the IPhone class (Brainstorm on which variables can be static in IPhone Class )
//    Create an IPhoneMainClass and use these three constructors to create three different objects
//    Set static variable value for each object & Print all the values
//    Using three objects call methods of IPhone class

}
