package com.java.class29;

class Vehicle{
    Vehicle(){
        System.out.println("From Vehicle");
    }
}

class Car extends Vehicle{

}

class SportCar extends Car{
    SportCar(){
        System.out.println("From SportCar");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        SportCar car = new SportCar();
    }
}
