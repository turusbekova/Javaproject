package com.java.class05;

public class CompoundOperators {
    public static void main(String[] args) {

        // Compound Operators are easy way to use the current value of a variable
        // and add, substruct, multiple or divide be a new value and
        // reassign the resulting value into the original variable

        // the only use case for compound operators is clean code
        // you avoid typing the variable name twice for the calculation
        // less code is always a better code
        int num1 = 10;
        num1 += 5; // num1 = num1 + 5
        System.out.println(num1);

        int num2 = 11;
        num2 += 22;
        System.out.println(num2);

        num2 += 5;
        System.out.println(num2);

        num2 += 14;
        System.out.println(num2);

        num2 -= 11;
        System.out.println(num2);

        num2 -= 5;
        System.out.println(num2);

        System.out.println(num2 - 5); //

        num2 -= 2;
        System.out.println(num2); // 36 - 2

        System.out.println("___________________________________");

        int numberOfChicken = 100;
        numberOfChicken += 50;
        System.out.println(numberOfChicken);

        numberOfChicken *= 2;
        System.out.println(numberOfChicken);

        numberOfChicken /= 10;
        System.out.println(numberOfChicken);

        numberOfChicken %= 2;
        System.out.println(numberOfChicken);


    }
}
