package com.java.homeWork.ifelseHW;

import java.util.Scanner;

public class IfElseHomeWork {
    public static void main(String[] args) {
        // ask the user how many java exercises are you solving per day
        // if it's less than 3 - print out - you are too lazy
        // if it's more than or equal 3 and less than 5 - good job, but you should  do better
        // if it's more than or equal 5 than print out - great job! You are on the right track!

        Scanner scan = new Scanner(System.in);

        System.out.println("how many java exercises are you solving per day?");
        int homeWorks = scan.nextInt();

        if (homeWorks < 3){
            System.out.println("you are too lazy(");
        }
        else if (homeWorks >= 3 && homeWorks < 5){
            System.out.println("good job, but you should  do better");
        }
        else if (homeWorks >= 5){
            System.out.println("great job! You are on the right track!1");
        }


    }
}
