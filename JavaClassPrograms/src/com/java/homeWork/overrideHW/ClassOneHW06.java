package com.java.homeWork.overrideHW;

abstract class Car{

    public abstract void drive();

    void speed(){
        System.out.println("Car has fast speed");
    }

    static void stop(){
        System.out.println("Car is stopping");
    }
}

class ChildCar extends Car{

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

class MainCar{
    public static void main(String[] args) {
        ChildCar childCar = new ChildCar();
        childCar.drive();
        childCar.speed();
        ChildCar.stop();
    }
}

public class ClassOneHW06 {


//    Task 1:
//    Create an abstract class called Car
//            create one abstract, one non-abstract, and one static method in the abstract class
//    Create a child class & override parent class abstract methods
//    Create a MainClass
//    Create an object of the child class with reference of the parent class
//    Call all three methods

}
