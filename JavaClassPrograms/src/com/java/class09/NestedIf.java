package com.java.class09;

public class NestedIf {

    public static void main(String[] args) {

        // first if statement scope {} -> is outer if statement
        // if line 11 if statement is false then the program is going to line 18

//        if (){
//            if (){
//
//            }
//        }

        boolean outerBoolean = true;
        boolean innerBoolean = false;

        // this program wont print out anything because
        // first is true
        //and inner if is false
        if (true){
            if (false){
                System.out.println("Hi from Inner If statement");
            }
        }

        System.out.println("----------------------------------------");

        if (true){
            if (true){
                System.out.println("Hi from Inner If statement");
            }
        }

        System.out.println("----------------------------------------");

        if (false){
            if (true){
                System.out.println("Hi from Inner If statement");
            }
        }

        System.out.println("----------------------------------------");

        if (true){
            if (true){
                System.out.println("Hi 4");
            }
            System.out.println("outer hi 4");
        }


        System.out.println("----------------------------------------");

        if (true){
            System.out.println("Outer hi 5.1");
            if (false){
                System.out.println("Hi 5");
            }
            else {
                System.out.println("Outer Else ");
            }
            System.out.println("outer hi 4");
        }
        else {
            System.out.println("hi everyone");
            if (false){
                System.out.println("12.1");
            }
            else if (true){
                System.out.println("");
            }
        }

        // ctrl + f + ctrl r

    }
}
