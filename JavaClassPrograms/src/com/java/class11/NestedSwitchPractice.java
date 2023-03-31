package com.java.class11;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please choose a type of sandwich: \n We have: \n 1. Chicken s.\n 2. Beef s.\n 3. Pork s.");
//        String sandwich = scan.nextLine();
//        switch (sandwich){
//            case "Chicken":
//                System.out.println("Please take your chicken sandwich!");
//                break;
//            case "Beef":
//                System.out.println("Please take your beef sandwich!");
//                break;
//            case "Pork":
//                System.out.println("Please take your pork sandwich!");
//                break;
//            default:
//                System.out.println("If you a vegetarian, we have a vegetarian sandwiches");
//                String vegSandwich = scan.nextLine();
//                switch (vegSandwich){
//                    case "Tomato and Mozzarella":
//                        System.out.println("Please take your Tomato and Mozzarella");
//                        break;
//                    case "Eggplant and Parmesan":
//                        System.out.println("Eggplant and Parmesan");
//                        break;
//                    case "Cucumber and Swiss cheese":
//                        System.out.println("Cucumber and Swiss cheese");
//                        break;
//                    default:
//                        System.out.println("ERROR");
//                }
//
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a type of sandwich:");
        String sandwichType = scan.nextLine();
        switch(sandwichType) {
            case "Chicken":
                System.out.println("Chicken Sandwich");
                break;
            case "Beef":
                System.out.println("Beef Sandwich");
                break;
            case "Pork":
                System.out.println("Pork Sandwich");
                break;
            case "Vegetarian":
                System.out.println("If you are a vegetarian we have another variants");
                String fillingType = scan.nextLine();
                switch(fillingType) {
                    case "Tomato and Mozzarella":
                        System.out.println("Tomato and Mozzarella filling");
                        break;
                    case "Eggplant and Parmesan":
                        System.out.println("Eggplant and Parmesan filling");
                        break;
                    case "Cucumber and Swiss cheese":
                        System.out.println("Cucumber and Swiss cheese filling");
                        break;
                    default:
                        System.out.println("Choice was not any of the above.");
                }
            default:
                System.out.println("Choice was not Chicken, Beef, Pork, or Vegetarian");
        }

    }
}
