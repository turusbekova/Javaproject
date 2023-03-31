package com.java.practice;

import com.sun.javafx.image.impl.ByteIndexed;

public class CarMain {
    public static void main(String[] args) {

        Car obj = new Car();
        System.out.println(obj.mark + "\n"
                + obj.model + "\n"
                + obj.color + "\n"
                + obj.capacity + "\n"
                + obj.year + "\n"
                + obj.countryOfOrigin);

        System.out.println("===================");
        obj.model = "GW"; // можно создать значение и в другом классе и можно в самом а потом переназначить
        System.out.println(obj.mark + "\n"
                + obj.model + "\n"
                + obj.color + "\n"
                + obj.capacity + "\n"
                + obj.year + "\n"
                + obj.countryOfOrigin);

        // Car carMethods = new Car(); // можно создавать несколько обьектов только чтобы названия были разные

        System.out.println("===================");
        System.out.println(obj.driving());
        System.out.println(obj.model + " " + obj.beep());

        System.out.println("===============");
        obj.mark = "GW";
        obj.year = 2020;
        obj.color = "white";
        obj.countryOfOrigin = "Germany";
        System.out.println(obj.mark + "\n" + obj.year + "\n" + obj.color + "\n" + obj.countryOfOrigin);

        System.out.println("================");
        obj.mark = "MayBach";
        obj.year = 2021;
        obj.color = "silver";
        obj.countryOfOrigin = "Korea";
        System.out.println(obj.mark + "\n" + obj.year + "\n" + obj.color + "\n" + obj.countryOfOrigin);

        // везде произошло переназначение








    }
}
