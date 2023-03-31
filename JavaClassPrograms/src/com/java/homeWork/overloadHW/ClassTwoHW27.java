package com.java.homeWork.overloadHW;
class Parent{
    void sayHello(){
        System.out.println("Hello from ParentClass");
    }
}

class Child extends Parent{
    @Override
    void sayHello() {
        super.sayHello();
    }
}

class MainClass{
    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
    }
}

public class ClassTwoHW27 {
    //    Task 3:
//    Create two classes with Parent and Child relationship
//    Create a method inside the parent class and override in the child class using @Override annotation
//    Create a MainClass
//    Create an object of the child class and called the overridden method
}
