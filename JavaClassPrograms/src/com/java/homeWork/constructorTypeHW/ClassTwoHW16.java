package com.java.homeWork.constructorTypeHW;

class ClassStaticVariables{
    static String mark;
    static String model;
    static String color;
    static double capacity;
    static int year;
    static String countryOfOrigin;


}

class MainClass{
    public static void main(String[] args) {
        ClassStaticVariables staticVariables = new ClassStaticVariables();
        staticVariables.mark = "Mercedes";
        ClassStaticVariables.model = "S class";
        ClassStaticVariables.color = "Black";
        ClassStaticVariables.capacity = 6.3;
        ClassStaticVariables.year = 2022;
        ClassStaticVariables.countryOfOrigin = "Germany";

        System.out.println("Mark --> " + ClassStaticVariables.mark + "\n" +"Model --> " + ClassStaticVariables.model
                + "\n" + "Color --> " + ClassStaticVariables.color + "\n" +
                "Capacity --> " + ClassStaticVariables.capacity + "\n" +
                "Year --> " + ClassStaticVariables.year + "\n" +
                "Country Of Origin --> " + ClassStaticVariables.countryOfOrigin + "\n");
    }

}

public class ClassTwoHW16 {
    //    Task 2:
//    Write a program to create a Class with all static variables (Use any example)
//    Create a MainClass and print all the static variable values directly using the class name (It will print default values)
//Create an object of the class and set static variables values through the object
//    Print all the static variable values directly using the class name
}
