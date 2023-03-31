package com.java.class39;

import java.util.*;

public class MapAllKeys {
    public static void main(String[] args) {
        Map<String, Integer> studentsMarks = new HashMap<>();
        studentsMarks.put("Anna", 50);
        studentsMarks.put("Mike", 60);
        studentsMarks.put("John", 70);
        studentsMarks.put("Peter", 80);

        Set<String> setOfKeys = studentsMarks.keySet();
        for (String key : setOfKeys){
            System.out.println(key + " = " + studentsMarks.get(key));
        }

        Collection<Integer> values = studentsMarks.values();
        for (int value : values){
            System.out.println(value);
        }
    }
}
