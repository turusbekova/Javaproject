package com.java.practice.constructorPractice;

public class Phone {
    public String mark;
    public String model;
    public double memory;
    public String color;
    public String os;
    public float price;

    public Phone(String mark1, String model1, double memory1, String color1, String os1, float price1){
        mark = mark1;
        model = model1;
        memory = memory1;
        color = color1;
        os = os1;
        price = price1;
    }

    // Alt + insert --> for calling constructor


    public Phone(String mark, String model, double memory, String color, String os) {
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.os = os;
    }

    // this - keyword
    // this - именно этот, он нужен для того чтобы не придумывать новые названия


    public Phone(String mark, String model, double memory, String color) {
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }

    // toString - на автомате печатает, точнее красивый синтаксис делает

    public String buyPhoneForBegimai(){
        return model + " for Begimai";
    }

    public String buySamsung(){
        return "We should buy Samsung";
    }


}
