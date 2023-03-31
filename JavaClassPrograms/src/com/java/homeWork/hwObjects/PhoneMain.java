package com.java.homeWork.hwObjects;


import javax.jws.soap.SOAPBinding;

public class PhoneMain {
    public static void main(String[] args) {
        Phone apple = new Phone("Iphone");
        Phone samsung = new Phone("Galaxy");
        Phone redmi = new Phone("RedMi");

        apple.color = "black";
        apple.batteryStatus = 100;
        apple.countryOfOrigin = "USA";
        apple.version = "14 Pro Max";
        apple.phoneMemory = 128;

        System.out.println(apple.nameVariable + ": " + "\n" + "Version --> "
                + apple.version + "\n" + "Color --> " +  apple.color +
                "\n" + "Country of origin --> " + apple.countryOfOrigin +
                "\n" + "Battery status --> " + apple.batteryStatus
        + "%" + "\n" + "Phone Memory --> " +  apple.phoneMemory + "GB");

        apple.call();
        apple.photo();
        apple.message();

        System.out.println("=================");

        samsung.color = "gray";
        samsung.version = "S23 Ultra";
        samsung.phoneMemory = 64;
        samsung.countryOfOrigin = "South Korean";
        samsung.batteryStatus = 100;

        System.out.println(samsung.nameVariable + ": " + "\n" + "Version --> "
                + samsung.version + "\n" + "Color --> " +  samsung.color +
                "\n" + "Country of origin --> " + samsung.countryOfOrigin +
                "\n" + "Battery status --> " + samsung.batteryStatus
                + "%" + "\n" + "Phone Memory --> " +  samsung.phoneMemory + "GB");

        samsung.message();
        samsung.photo();
        samsung.call();

        System.out.println("=================");

        redmi.color = "white";
        redmi.version = "A4";
        redmi.phoneMemory = 64;
        redmi.countryOfOrigin = "Chinese";
        redmi.batteryStatus = 100;

        System.out.println(redmi.nameVariable + ": " + "\n" + "Version --> "
                + redmi.version + "\n" + "Color --> " +  redmi.color +
                "\n" + "Country of origin --> " + redmi.countryOfOrigin +
                "\n" + "Battery status --> " + redmi.batteryStatus
                + "%" + "\n" + "Phone Memory --> " +  redmi.phoneMemory + "GB");

        redmi.call();
        redmi.photo();
        redmi.message();



    }
}
