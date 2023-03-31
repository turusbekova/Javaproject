package com.java.homeWork.polymorphismHW;
class Food {
    int calories;
    String name;

    Food(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    Food(String name) {
        this(0, name);
    }
}

class VegFood extends Food {
    boolean isVegan;

    VegFood(int calories, String name, boolean isVegan) {
        super(calories, name);
        this.isVegan = isVegan;
    }

    VegFood(String name, boolean isVegan) {
        this(0, name, isVegan);
    }
}

class Salad extends VegFood {
    String dressing;

    Salad(int calories, String name, boolean isVegan, String dressing) {
        super(calories, name, isVegan);
        this.dressing = dressing;
    }

    Salad(String name, boolean isVegan, String dressing) {
        super(name, isVegan);
        this.dressing = dressing;
    }
}

 class MainClass {
    public static void main(String[] args) {
        Salad salad = new Salad("Green Salad", true, "Balsamic Vinaigrette");
        System.out.println(salad.name);
        System.out.println(salad.calories);
        System.out.println(salad.isVegan);
        System.out.println(salad.dressing);
    }
}



public class ClassOneHW23 {
//    Task 1:
//    Create a class Food, VegFood, and Salad
//            Create two constructors in each class
//    Call the second constructor of each class from the first constructor using this() keyword
//    Call the VegFood Class constructor from the Salad Class constructor using the super() keyword
//    Call the Food class constructor from VegFood Class constructor using the super() keyword
//    Create a MainClass and create an object of Salad Class & Execute the code
//    without errors

}
