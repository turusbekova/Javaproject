package com.java.class29;

class HotDrinks{
    HotDrinks(){
        System.out.println("HotDrinks");
    }

    HotDrinks(String name){
        System.out.println(name);
    }
}

class Tea extends HotDrinks{
    Tea(){
        this("Original");
        System.out.println("Prep tea");
    }

    Tea (String flavour){
        this("Masala", true);
        System.out.println("Prep tea with flavour " + flavour);
    }

    Tea (String flavour, boolean withSugar){
        System.out.println("Prep tea with flavour " + flavour);
    }
}
public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Tea tea = new Tea();
    }
}
