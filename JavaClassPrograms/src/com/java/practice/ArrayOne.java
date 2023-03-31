package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // все созданное с ключевым словом new - обьект
        int numbers [] = new int [3]; // 0,1,2
        numbers[0] = 32;
        numbers[1] = 7;
        numbers[2] = 100;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);

        // exception - исключение

        System.out.println(numbers.length); // общая длина - 3
        String name = "Begimai";
        System.out.println(name.length());
        // отличается от стринга тем что у стринга length() а у array - length

        String strs [] = new String[4];
        strs[0] = "Begimai";
        strs[1] = "Aizhamal";
        strs[2] = "Zhamilya";
        strs[3] = "Elniza";
        System.out.println(Arrays.toString(strs));
        System.out.println(strs[0] == strs[1]);

        String name1 = strs[0].replace("Begimai", "Baha");
        strs[0] = "Baha";
        System.out.println(Arrays.toString(strs));

        System.out.println(strs[0].substring(0,2));

        double [] point = new double[2];
        point[0] = 29.1;
        point[1] = 67.4;
        System.out.println(Arrays.toString(point));





    }
}
