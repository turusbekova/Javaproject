package com.java.class32;

class Phone{
    private String model;
    private String brand;
    private String color;
    private int memory;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Phone p = new Phone();

    }
}
