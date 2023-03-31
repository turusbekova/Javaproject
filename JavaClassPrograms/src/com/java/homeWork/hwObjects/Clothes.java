package com.java.homeWork.hwObjects;

public class Clothes {
    String typeOfClothes;
    String color;
    String size;
    String medium;

    public void conditionsOfClothes(String clothing){
        if (clothing.equalsIgnoreCase("T-shirt")){
            System.out.println("We have three colors of T-shirt:\n 1. black\n 2. white\n 3.gray");
        }
        else if (clothing.equalsIgnoreCase("Dress")){
            System.out.println("We have five colors of dress:\n 1. light-blue\n 2. gray\n 3. white\n 4. dark-blue\n 5. dark-green");
        }
        else if (clothing.equalsIgnoreCase("Jeans")){
            System.out.println("We have only couple colors of jeans:\n 1. dark-blue\n 2. black");
        }
    }


}
