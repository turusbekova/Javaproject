package com.java.class30;
class Car{
    void drive(){
        System.out.println("Driving at speed of 100");
    }

    void playMusic(){
        System.out.println("Playing Music");
    }
}

class SportCar extends Car{
    void drive(){
        System.out.println("Driving at speed 180");
    }
}


public class MethodOverridingExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();

        SportCar sP = new SportCar();
        sP.drive();
        sP.playMusic();
    }
}
