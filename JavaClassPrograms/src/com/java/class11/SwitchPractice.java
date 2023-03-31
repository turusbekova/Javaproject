package com.java.class11;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our hotel! \nWe glad to see you! \nWe have the best rooms and conditions from our city");
        System.out.println("We have ten floors \nif you press 1 you get a list of rooms from the first floor " +
                "\nif 2 you get a list of rooms from the second floor, etc. up to 10");
        String hotel = scan.nextLine();

        switch (hotel){
            case "1":
                System.out.println("In this floor we have: \nReception\nCoffee Bar ");
                break;
            case "2":
                System.out.println("In this floor we have: \nrooms from 1 to 10\ngym");
                break;
            case "3":
                System.out.println("In this floor we have: \nrooms from 11 to 20\nBilliard rooms");
                break;
            case "4":
                System.out.println("In this floor we have: \nrooms from 21 to 30");
                break;
            case "5":
                System.out.println("In this floor we have: \nrooms from 31 to 40\nHotel office");
                break;
            case "6":
                System.out.println("In this floor we have: \nrooms from 41 to 50\nGym");
                break;
            case "7":
                System.out.println("In this floor we have: \nrooms from 51 to 60");
                break;
            case "8":
                System.out.println("In this floor we have: \nrooms from 61 to 70\nCoffee Bar");
                break;
            case "9":
                System.out.println("In this floor we have: \nrooms from 71 to 80\nSwimming Pool");
                break;
            case "10":
                System.out.println("In this floor we have: \nRestaurant\nOutdoor Swimming Pool");
                break;
            default:
                System.err.println("Please select from the list!");
        }

    }
}
