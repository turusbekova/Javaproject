package com.java.class39;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, Integer> studentsMarks = new HashMap<>();
        studentsMarks.put("Anna", 50);
        studentsMarks.put("Mike", 60);
        studentsMarks.put("John", 70);
        studentsMarks.put("Peter", 80);
        System.out.println(studentsMarks);

        System.out.println("=================================");
        List<String> ingredientsBoiledRice = new ArrayList<>();
        ingredientsBoiledRice.add("raw rice");
        ingredientsBoiledRice.add("water");
        ingredientsBoiledRice.add("air");

        List<String> ingredientsVegetableCurry = new ArrayList<>();
        ingredientsVegetableCurry.add("Vegetables");
        ingredientsVegetableCurry.add("salt");
        ingredientsVegetableCurry.add("oil");
        ingredientsVegetableCurry.add("water");
        ingredientsVegetableCurry.add("spice");

        Map<String, List<String>> dishes = new HashMap<>();
        dishes.put("Boiled rice", ingredientsBoiledRice );
        dishes.put("Vegetable Curry", ingredientsVegetableCurry);
        System.out.println(dishes);


        System.out.println("=================================");
        Map<String, List<String>> dishes2 = new HashMap<>();
        List<String> ingredients = new ArrayList<>();
        ingredients.add("raw rice");
        ingredients.add("water");
        ingredients.add("air");
        ingredients.add("Vegetables");
        dishes2.put("Boiled rice", ingredients);

        ingredients = new ArrayList<>();
        ingredients.add("oil");
        ingredients.add("salt");
        ingredients.add("water");
        dishes2.put("Vegetable Curry", ingredients);
        System.out.println(dishes2);




    }
}
