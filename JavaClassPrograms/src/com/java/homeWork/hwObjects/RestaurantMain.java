package com.java.homeWork.hwObjects;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Restaurant obj = new Restaurant();
        Scanner meal = new Scanner(System.in);

        // waiter is coming
        obj.waitersGreeting();
        // telling about menu
        obj.menu();
        obj.order = scan.next();
        // telling about type of kitchen
        obj.typeOfKitchen(obj.order);
        // telling about ingredients of meals
        obj.waiterAsk();
        obj.meal = meal.nextLine();
        obj.ingredients(obj.meal);










    }
}
