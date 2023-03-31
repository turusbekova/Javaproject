package com.java.class30;

class Shape{
    void draw(){
    }

    void erase(){

    }
}

class Circle extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("drawing circle");
    }
}

class Square extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("drawing square");
    }
}
public class OverrideAndOverloadPractice {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();
        circle.draw();
        square.draw();
    }
}
