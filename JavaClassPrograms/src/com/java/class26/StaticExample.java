package com.java.class26;

class Car1{
    static int price; // 0

    Car1(){
        price++; // 1
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Car1 audi = new Car1(); //1

        Car1 bmw = new Car1();//2

        Car1 honda = new Car1();//3
        System.out.println(honda.price);
        System.out.println(audi.price);
        System.out.println(bmw.price);

//        System.out.println(audi.price);
//        System.out.println(audi.price);
//        System.out.println(audi.price);
//        System.out.println(bmw.price);
//        System.out.println(honda.price);
    }
}
