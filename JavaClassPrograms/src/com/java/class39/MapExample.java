package com.java.class39;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Begimai", 20);
        ageOfPeople.put("Aizhamal", 20);
        ageOfPeople.put("Elniza",18);
        ageOfPeople.put("Jamilya", 21);

        System.out.println(ageOfPeople);
        System.out.println(ageOfPeople.get("Begimai"));
        System.out.println(ageOfPeople.size());
        System.out.println(ageOfPeople.isEmpty());
        System.out.println(ageOfPeople.containsKey("Aizhamal"));



    }
}
