package com.java.practice.constructorPractice;

public class PhoneMain {
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "Iphone 13 Pro", 64.00, "blue", "ios", 74f);
        System.out.println(iphone);
        Phone mi = new Phone("Redmi", "A10", 64.00, "black", "os");
        System.out.println(mi);
        Phone samsung = new Phone("Samsung", "Galaxy S22", 256.00, "white");
        System.out.println(samsung);

        float dollars1 = 79.0f;
        float dollars2 = 80.0f;
        float dollars3 = 82.0f;

        float budget = 900.0f;

        if (budget * dollars1 >= iphone.price){
            System.out.println("24.05 - " + iphone.buyPhoneForBegimai());
        }
        else if (budget * dollars2 >= iphone.price){
            System.out.println("25.05 - " + iphone.buyPhoneForBegimai());
        }
        else if (budget * dollars3 >= iphone.price){
            System.out.println("26.05 - " + iphone.buyPhoneForBegimai());
        }
        else {
            System.out.println(samsung.buySamsung());
        }

    }
}
