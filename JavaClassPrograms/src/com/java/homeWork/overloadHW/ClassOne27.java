package com.java.homeWork.overloadHW;

class Adding{

    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    void add(double a, double b, double c){
        System.out.println(a + b + c);
    }

    void add(String a, String b){
        System.out.println(a + " " + b);
    }
}

class MainAdding{
    public static void main(String[] args) {
        Adding addInt = new Adding();
        addInt.add(1,2,3);

        Adding addDouble = new Adding();
        addDouble.add(1.2, 3.4,3.5);

        Adding addString = new Adding();
        addString.add("Hello", "DevXers");
    }
}

public class ClassOne27 {
//    Task 1:
//    Brainstorm and understand DynamicPolyExample from today's class
//    Task 2:
//    Create a Class of your choice
//    Identify and create three different methods inside the class with the same name (the argument can be different)
//    Task 3:
//    Create two classes with Parent and Child relationship
//    Create a method inside the parent class and override in the child class using @Override annotation
//    Create a MainClass
//    Create an object of the child class and called the overridden method



}
