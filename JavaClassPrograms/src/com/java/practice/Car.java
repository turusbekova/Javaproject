package com.java.practice;

public class Car {

    // instance variables -> fields, поля --> если создали переменные на уровне класса то поля
   public String mark = "Mercedes";
   public String model = "S class";
   public String color = "Black";
   public double capacity = 6.3;
   public int year = 2022;
   public String countryOfOrigin = "Germany";

    public String driving(){
        return model + " is driving"; // local variables - на уровне метода переменные
    }

    public String beep(){
        return "Beep Beep!!!";
    }

    // горяие кнопки: чтобы поменять одно слово в несколько строк сразу нужно Shift+R --> ReplaceAll




}
