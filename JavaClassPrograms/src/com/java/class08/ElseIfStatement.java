package com.java.class08;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        // hasLicense
        //speedLimit
        boolean hasLicense = false;
        int speedLimit = 100;

        // as soon as you get a true if else or else if statement you execute that if statement
        // and jump out of the whole else if group

        if (hasLicense  && speedLimit < 80){
            System.out.println("have a Safe Journey");
        }
        else if(hasLicense  && speedLimit > 80){
            System.out.println("we have to tow your car");
        }
        if (!hasLicense  && speedLimit < 80){
            System.out.println("Give speeding ticket");
        }
        else if(!hasLicense  && speedLimit > 80){
            System.out.println("you must appear in the court");
        }

        // the coding standards is :
        // usually the pairs go as
        // else means none of the above if statement were true

    }
}
