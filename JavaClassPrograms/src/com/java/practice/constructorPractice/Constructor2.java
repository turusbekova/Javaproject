package com.java.practice.constructorPractice;

public class Constructor2 {
    String mark;
    String model;
    String color;
    double volume;
    int wheel;
    int year;

    // Constructor --> имеет название текущего класса
    public Constructor2(String mark1, String model1, String color1, double volume1,
                        int wheel1, int year1){
        mark = mark1;
        model = model1;
        color = color1;
        volume = volume1;
        wheel = wheel1;
        year = year1;
    }

    public String driving(){
        return model + " is driving";
    }

    public String beeping(){
        return model + ": Beep! Beep!";
    }

    public void getInfo(){
        System.out.println("Mark:  + " + mark +"\n"
                + "Model: " + model + "\n"
                + "Color: " + color + "\n"
                + "Wheel: " + wheel + "\n"
                + "Volume: " + volume + "\n"
                + "Years: " + year);
    }

    public Constructor2(String mark2, String model2, int yrs){
        mark = mark2;
        model = model2;
        year = yrs;
    }
}
