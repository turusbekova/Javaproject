package com.java.homeWork.hwObject2;

public class IphoneClass {
    String model = "Iphone";
    String version;
    String color;
    String countryOfOrigin;
    int phoneMemory;
    int batteryStatus;

    IphoneClass(String namePhoneFromUser){
        model = namePhoneFromUser;
        System.out.println(namePhoneFromUser + " is playing music");
    }


}
