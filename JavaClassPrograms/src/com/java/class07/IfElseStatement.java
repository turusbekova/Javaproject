package com.java.class07;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class IfElseStatement {
    public static void main(String[] args) {
        // if statement is a logical flow control
        // you cna write a program that executes certain portion of the code
        //only in certain conditions

//        if (true){
//            System.out.println("Hello World");
//            System.out.println("Hello Jupiter");
//        }
//        // proceed with a normal execution
//        System.out.println("I'm outside of IF statement");

        // when you have only one statement onside if statement
        // you can skip {}
        if (false) {
            System.out.println("hello mars");
        }
        System.out.println("hello saturn"); // Hello Saturn is outside of If Statement
        // it will print out in any condition

        // I want to print out hV only if my gallonOfOil > 1000
        int gallonOfOil = 4000;
        if (gallonOfOil > 1000){
            System.out.println("hello Venus");
        }
        else {
            System.out.println("nothing");
        }
    }
}
