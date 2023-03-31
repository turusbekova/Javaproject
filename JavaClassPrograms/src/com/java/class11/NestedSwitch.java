package com.java.class11;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        // case or default statements can have entire switch statement inside
//
//        int num = 1;
//        String country = "Canada";
//        switch(num){
//            case 1:
//                System.out.println("case 1");
//                switch (country){
//                    case "USA":
//                        break;
//                    case "Canada":
//                        break;
//            }
//            case 2:
//                System.out.println("case 2");
//                switch (country){
//
//                }
//            case 3:
//                System.out.println("case 3");
//                switch (num2){
//
//                }
//            case 4:
//                System.out.println("case 4");
//                switch (num2){
//
//                }
//            case 10:
//                System.out.println("case 10");
//                switch (num2){
//
//            }


        //Online store.
// we want to write a program which calculates shipping cost based on
//destination and based on total spending
//if the customer is spending less than $5 than charge $5 for shipping
//if spending more than 5 and less or equal to $10 then charge $10


//if spending more than 10 then.
//we also look at the shipping destination.
//if it's usa -> we should charge 10% of the total spending for shipping
//if it's canada -> charge 15% of total spending
//if it's Europe -> charge 20% of total spending
//if it's any other place -> charge 25% of total spending
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a country:");
        String destination = scan.next();
        System.out.println("Please enter a total spending;");
        double totalSpending = scan.nextDouble();

        switch ((int)totalSpending){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Shipping cost is 5$");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Shipping cost is $10");
                break;
            default:
                if (totalSpending <= 0){
                    System.err.println("ERROR");
                    break;
                }

                switch (destination){
                    case "USA":
                        System.out.println("Shipping cost is $" + totalSpending * 0.1);// 10%
                        break;
                    case "CANADA":
                        System.out.println("Shipping cost is $" + totalSpending * 0.15);// 15%
                        break;
                    case "EUROPE":
                        System.out.println("Shipping cost is $" + totalSpending * 0.2);// 20%
                        break;
                    default:
                        System.out.println("Shipping cost is $" + totalSpending * 0.25);// 25%
                }

        }
        }
    }

