package com.java.homeWork.hwObjects;

public class Phone {

    String version;
    String color;
    String countryOfOrigin;
    int phoneMemory;
    int batteryStatus;
    String nameVariable;

    Phone (String name){
      nameVariable = name;
    }

    public void call (){
        System.out.println(
                nameVariable + " is calling");
    }

    public void photo (){

        System.out.println(nameVariable + " is taking photos");
    }

    public void message (){

        System.out.println(nameVariable + " is sending message");
    }

}
