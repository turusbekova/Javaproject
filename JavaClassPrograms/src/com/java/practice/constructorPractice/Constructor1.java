package com.java.practice.constructorPractice;

public class Constructor1 {
        String mark;
        String model;
        String color;
        double volume;
        int wheel;
        int year;

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
}
